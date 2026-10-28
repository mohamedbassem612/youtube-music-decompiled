package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wlo extends zyn implements tnz, toa {
    protected wlo(wlu wluVar, zza zzaVar, vyt vytVar, tnr tnrVar, ainp ainpVar) {
        super(tnrVar, new zrq(zzaVar, vytVar), !wluVar.w(), ainpVar);
    }

    public abstract void S(MessageLite messageLite);

    @Deprecated
    public abstract void T();

    @Deprecated
    public abstract void U();

    public abstract void V();

    @Override // defpackage.tns
    public abstract Class ab();

    @Override // defpackage.tns
    public /* bridge */ /* synthetic */ void ad(Object obj) {
        throw null;
    }
}
