package com.practise.immutableCollection;

import java.util.Collection;

public class ImmutableCollectionImpl<E> implements ImmutableCollection<E> {
    private final Collection<E> immutableCollection;

    public ImmutableCollectionImpl(Collection<E> collection) {
        this.immutableCollection = collection;
    }
    public ImmutableCollection<E> add(E e) throws Exception {
       // throw new MethodNotImplementedException("add");
        Collection<E> newCollection =
                new java.util.ArrayList<>(immutableCollection);
        newCollection.add(e);

        return new ImmutableCollectionImpl<>(newCollection);
    }

    public ImmutableCollection<E> remove(E e) throws Exception {
        Collection<E> newCollection =
                new java.util.ArrayList<>(immutableCollection);

        newCollection.remove(e);

        return new ImmutableCollectionImpl<>(newCollection);
    }

    public int size() {
        return immutableCollection.size();
    }
}
