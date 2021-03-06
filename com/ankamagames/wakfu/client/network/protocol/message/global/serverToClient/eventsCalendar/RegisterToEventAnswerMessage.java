package com.ankamagames.wakfu.client.network.protocol.message.global.serverToClient.eventsCalendar;

import com.ankamagames.baseImpl.client.proxyclient.base.network.protocol.message.*;
import java.nio.*;

public class RegisterToEventAnswerMessage extends InputOnlyProxyMessage
{
    private byte m_errorCode;
    private long m_eventId;
    
    @Override
    public boolean decode(final byte[] rawDatas) {
        final ByteBuffer bb = ByteBuffer.wrap(rawDatas);
        this.m_errorCode = bb.get();
        this.m_eventId = bb.getLong();
        return true;
    }
    
    public byte getErrorCode() {
        return this.m_errorCode;
    }
    
    public long getEventId() {
        return this.m_eventId;
    }
    
    @Override
    public int getId() {
        return 570;
    }
}
