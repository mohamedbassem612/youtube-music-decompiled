package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aihm {
    public static final aihm a;
    public static final aihm b;
    public static final aihm c;
    public static final aihm d;
    public static final aihm e;
    public static final aihm f;
    public static final aihm g;
    private static final /* synthetic */ aihm[] h;

    static {
        aihm aihmVar = new aihm("GET_MEMOIZED_IS_INITIALIZED", 0);
        a = aihmVar;
        aihm aihmVar2 = new aihm("SET_MEMOIZED_IS_INITIALIZED", 1);
        b = aihmVar2;
        aihm aihmVar3 = new aihm("BUILD_MESSAGE_INFO", 2);
        c = aihmVar3;
        aihm aihmVar4 = new aihm("NEW_MUTABLE_INSTANCE", 3);
        d = aihmVar4;
        aihm aihmVar5 = new aihm("NEW_BUILDER", 4);
        e = aihmVar5;
        aihm aihmVar6 = new aihm("GET_DEFAULT_INSTANCE", 5);
        f = aihmVar6;
        aihm aihmVar7 = new aihm("GET_PARSER", 6);
        g = aihmVar7;
        h = new aihm[]{aihmVar, aihmVar2, aihmVar3, aihmVar4, aihmVar5, aihmVar6, aihmVar7};
    }

    public static aihm[] values() {
        return (aihm[]) h.clone();
    }
}
