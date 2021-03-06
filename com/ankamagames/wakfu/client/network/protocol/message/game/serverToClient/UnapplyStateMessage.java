package com.ankamagames.wakfu.client.network.protocol.message.game.serverToClient;

import com.ankamagames.baseImpl.client.proxyclient.base.network.protocol.message.*;
import java.nio.*;

public class UnapplyStateMessage extends InputOnlyProxyMessage
{
    private byte[] m_serializedEffect;
    
    @Override
    public boolean decode(final byte[] rawDatas) {
        final ByteBuffer buffer = ByteBuffer.wrap(rawDatas);
        buffer.get(this.m_serializedEffect = new byte[buffer.get() & 0xFF]);
        return true;
    }
    
    @Override
    public int getId() {
        return 4123;
    }
    
    public byte[] getSerializedEffect() {
        return this.m_serializedEffect;
    }
}
