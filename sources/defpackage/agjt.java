package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agjt extends agkj implements Map, aghp {
    private static final long serialVersionUID = 912559;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.aghp
    public final /* bridge */ /* synthetic */ aghp a() {
        throw null;
    }

    @Override // defpackage.aghp
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Set values() {
        throw null;
    }

    public abstract agjt c();

    @Override // defpackage.agkj, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final agkz values() {
        return c().keySet();
    }

    @Override // defpackage.agkj
    public Object writeReplace() {
        return new agjs(this);
    }
}
