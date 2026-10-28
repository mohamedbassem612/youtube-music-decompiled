package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imr extends imf {
    public imr() {
        super(ankr.class, anpf.class);
    }

    @Override // defpackage.iml
    public final /* bridge */ /* synthetic */ MessageLite d(Object obj, agkj agkjVar) {
        aihf aihfVarCreateBuilder = anpf.a.createBuilder();
        alay alayVarC = ackj.c(((ankr) obj).getName());
        aihfVarCreateBuilder.copyOnWrite();
        anpf anpfVar = (anpf) aihfVarCreateBuilder.instance;
        alayVarC.getClass();
        anpfVar.c = alayVarC;
        anpfVar.b |= 1;
        return (anpf) aihfVarCreateBuilder.build();
    }
}
