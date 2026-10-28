package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aanv {
    public final aofh a;
    public final aanu b;

    public aanv(aofh aofhVar, aanp aanpVar, aanu aanuVar) {
        this.a = aofhVar;
        Optional.ofNullable(aanpVar);
        this.b = aanuVar;
    }

    public final boolean a() {
        aanu aanuVar = this.b;
        return aanuVar == aanu.d || aanuVar == aanu.f || aanuVar == aanu.e;
    }

    public aanv(aofh aofhVar, aanu aanuVar) {
        this(aofhVar, null, aanuVar);
    }
}
