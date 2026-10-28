package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agsc {
    public static final agsc c = new agry();
    public static final agsc d = new agry();

    protected agsc() {
    }

    static agsc b(agsc agscVar, agsc agscVar2) {
        agsc agscVar3;
        agsc agscVar4;
        if (agscVar != null) {
            if (agscVar2 == null || agscVar == (agscVar3 = c) || agscVar2 == (agscVar4 = d)) {
                return agscVar;
            }
            if (agscVar2 != agscVar3 && agscVar != agscVar4) {
                return new agrz(agscVar, agscVar2);
            }
        }
        return agscVar2;
    }

    protected abstract void a();
}
