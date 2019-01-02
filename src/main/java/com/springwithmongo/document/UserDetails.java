package com.springwithmongo.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

@Document
public class UserDetails implements Iterable {

    @Id
    ObjectId _id;
    String username;
    String useradd;
    int userphno;

    public UserDetails() {

    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public UserDetails(ObjectId _id,String username, String useradd, int userphno) {
        this.username = username;
        this.useradd = useradd;
        this.userphno = userphno;
        this._id=_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseradd() {
        return useradd;
    }

    public void setUseradd(String useradd) {
        this.useradd = useradd;
    }

    public int getUserphno() {
        return userphno;
    }

    public void setUserphno(int userphno) {
        this.userphno = userphno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return userphno == that.userphno &&
                Objects.equals(username, that.username) &&
                Objects.equals(useradd, that.useradd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, useradd, userphno);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
