package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agpe extends agpd implements Serializable {
    public static final agpd a = new agpe();
    private static final long serialVersionUID = 0;

    @Override // defpackage.agpd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        agpf agpfVar = (agpf) obj;
        agpf agpfVar2 = (agpf) obj2;
        return agil.b.c(agpfVar.b, agpfVar2.b).c(agpfVar.c, agpfVar2.c).a();
    }
}
