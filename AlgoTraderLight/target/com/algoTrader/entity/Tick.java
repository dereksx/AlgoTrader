// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package com.algoTrader.entity;

/**
 * 
 */
public abstract class Tick
    extends com.algoTrader.BaseObject
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -2372555200633964059L;

    private java.util.Date dateTime;

    /**
     * 
     */
    public java.util.Date getDateTime()
    {
        return this.dateTime;
    }

    public void setDateTime(java.util.Date dateTime)
    {
        this.dateTime = dateTime;
    }

    private java.math.BigDecimal last;

    /**
     * 
     */
    public java.math.BigDecimal getLast()
    {
        return this.last;
    }

    public void setLast(java.math.BigDecimal last)
    {
        this.last = last;
    }

    private java.util.Date lastDateTime;

    /**
     * 
     */
    public java.util.Date getLastDateTime()
    {
        return this.lastDateTime;
    }

    public void setLastDateTime(java.util.Date lastDateTime)
    {
        this.lastDateTime = lastDateTime;
    }

    private int vol;

    /**
     * 
     */
    public int getVol()
    {
        return this.vol;
    }

    public void setVol(int vol)
    {
        this.vol = vol;
    }

    private int volBid;

    /**
     * 
     */
    public int getVolBid()
    {
        return this.volBid;
    }

    public void setVolBid(int volBid)
    {
        this.volBid = volBid;
    }

    private int volAsk;

    /**
     * 
     */
    public int getVolAsk()
    {
        return this.volAsk;
    }

    public void setVolAsk(int volAsk)
    {
        this.volAsk = volAsk;
    }

    private java.math.BigDecimal bid;

    /**
     * 
     */
    public java.math.BigDecimal getBid()
    {
        return this.bid;
    }

    public void setBid(java.math.BigDecimal bid)
    {
        this.bid = bid;
    }

    private java.math.BigDecimal ask;

    /**
     * 
     */
    public java.math.BigDecimal getAsk()
    {
        return this.ask;
    }

    public void setAsk(java.math.BigDecimal ask)
    {
        this.ask = ask;
    }

    private int openIntrest;

    /**
     * 
     */
    public int getOpenIntrest()
    {
        return this.openIntrest;
    }

    public void setOpenIntrest(int openIntrest)
    {
        this.openIntrest = openIntrest;
    }

    private java.math.BigDecimal settlement;

    /**
     * 
     */
    public java.math.BigDecimal getSettlement()
    {
        return this.settlement;
    }

    public void setSettlement(java.math.BigDecimal settlement)
    {
        this.settlement = settlement;
    }

    private int id;

    /**
     * 
     */
    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    private com.algoTrader.entity.Security security;

    /**
     * 
     */
    public com.algoTrader.entity.Security getSecurity()
    {
        return this.security;
    }

    public void setSecurity(com.algoTrader.entity.Security security)
    {
        this.security = security;
    }

    /**
     * 
     */
    public abstract java.math.BigDecimal getCurrentValue();

    /**
     * 
     */
    public abstract double getCurrentValueDouble();

    /**
     * Returns <code>true</code> if the argument is an Tick instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Tick))
        {
            return false;
        }
        final Tick that = (Tick)object;
        if (this.id != that.getId())
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (int)id;

        return hashCode;
    }

    /**
     * Constructs new instances of {@link com.algoTrader.entity.Tick}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link com.algoTrader.entity.Tick}.
         */
        public static com.algoTrader.entity.Tick newInstance()
        {
            return new com.algoTrader.entity.TickImpl();
        }

        /**
         * Constructs a new instance of {@link com.algoTrader.entity.Tick}, taking all required and/or
         * read-only properties as arguments.
         */
        public static com.algoTrader.entity.Tick newInstance(java.util.Date dateTime, int vol, int volBid, int volAsk, java.math.BigDecimal bid, java.math.BigDecimal ask, int openIntrest, com.algoTrader.entity.Security security)
        {
            final com.algoTrader.entity.Tick entity = new com.algoTrader.entity.TickImpl();
            entity.setDateTime(dateTime);
            entity.setVol(vol);
            entity.setVolBid(volBid);
            entity.setVolAsk(volAsk);
            entity.setBid(bid);
            entity.setAsk(ask);
            entity.setOpenIntrest(openIntrest);
            entity.setSecurity(security);
            return entity;
        }

        /**
         * Constructs a new instance of {@link com.algoTrader.entity.Tick}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static com.algoTrader.entity.Tick newInstance(java.util.Date dateTime, java.math.BigDecimal last, java.util.Date lastDateTime, int vol, int volBid, int volAsk, java.math.BigDecimal bid, java.math.BigDecimal ask, int openIntrest, java.math.BigDecimal settlement, com.algoTrader.entity.Security security)
        {
            final com.algoTrader.entity.Tick entity = new com.algoTrader.entity.TickImpl();
            entity.setDateTime(dateTime);
            entity.setLast(last);
            entity.setLastDateTime(lastDateTime);
            entity.setVol(vol);
            entity.setVolBid(volBid);
            entity.setVolAsk(volAsk);
            entity.setBid(bid);
            entity.setAsk(ask);
            entity.setOpenIntrest(openIntrest);
            entity.setSettlement(settlement);
            entity.setSecurity(security);
            return entity;
        }
    }

// HibernateEntity.vsl merge-point
}