package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import java.util.*;
import com.ankamagames.wakfu.common.datas.*;
import com.ankamagames.framework.ai.criteria.antlrcriteria.*;

public final class IsOriginalController extends FunctionCriterion
{
    private static final ArrayList<ParserType[]> signatures;
    
    public IsOriginalController(final ArrayList<ParserObject> args) {
        super();
        this.checkType(args);
    }
    
    @Override
    protected List<ParserType[]> getSignatures() {
        return IsOriginalController.signatures;
    }
    
    @Override
    public int getValidity(final Object criterionUser, final Object criterionTarget, final Object criterionContent, final Object criterionContext) {
        if (criterionUser == null || !(criterionUser instanceof CriterionUser)) {
            throw new CriteriaExecutionException("on essaie de savoir si la cible est une invoc d'un user invalide " + criterionUser);
        }
        final List<CriterionUser> targetCharacter = CriteriaUtils.getTargetListCriterionUserFromParameters(true, criterionUser, criterionTarget, criterionContext, criterionContent);
        for (int i = 0, n = targetCharacter.size(); i < n; ++i) {
            final CriterionUser user = targetCharacter.get(i);
            if (user != null) {
                if (user.getId() == ((CriterionUser)criterionUser).getOriginalControllerId()) {
                    return 0;
                }
            }
        }
        return -1;
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.IS_ORIGINAL_CONTROLLER;
    }
    
    static {
        signatures = new ArrayList<ParserType[]>();
        final ParserType[] sig = new ParserType[0];
        IsOriginalController.signatures.add(sig);
    }
}
