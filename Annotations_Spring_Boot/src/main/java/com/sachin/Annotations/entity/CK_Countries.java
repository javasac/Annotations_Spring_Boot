package com.sachin.Annotations.entity;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class CK_Countries implements Serializable
{
    private String Code;
    private String name;

    public CK_Countries() {
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(Code, name);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        else if (!(obj instanceof CK_Countries))
        {
            return false;
        }

        CK_Countries ck = (CK_Countries)obj;
        return this.Code.equals(ck.Code) && this.name.equals(ck.name);
    }
}
