package com.sachin.Annotations.CustomAnnotation;

public class User
{
    @SKAnnotation(intKey = 0, stringKey="user", classTypeKey=User.class, stringArrayKey={"Sachin", "Nitin"})
    public void updateUser()
    {
    }
}
