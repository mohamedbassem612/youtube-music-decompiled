package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeml {
    public static final aeml a;
    public static final aeml b;
    public static final aeml c;
    public static final aeml d;
    private static final /* synthetic */ aeml[] e;

    static {
        aeml aemlVar = new aeml("PEEK", 0);
        a = aemlVar;
        aeml aemlVar2 = new aeml("CONTENTS_ENTER_ANIMATION", 1);
        b = aemlVar2;
        aeml aemlVar3 = new aeml("ENTER_FROM_BELOW_ANIMATION", 2);
        c = aemlVar3;
        aeml aemlVar4 = new aeml("REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION", 3);
        d = aemlVar4;
        e = new aeml[]{aemlVar, aemlVar2, aemlVar3, aemlVar4};
    }

    public static aeml[] values() {
        return (aeml[]) e.clone();
    }
}
