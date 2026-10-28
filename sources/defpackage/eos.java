package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eos {
    public static final eos a;
    public static final eos b;
    public static final eos c;
    public static final eos d;
    public static final eos e;
    public static final eos f;
    public static final eos g;
    private static final /* synthetic */ eos[] h;

    static {
        eos eosVar = new eos("CANCEL", 0);
        a = eosVar;
        eos eosVar2 = new eos("RESTORE", 1);
        b = eosVar2;
        eos eosVar3 = new eos("PAUSE", 2);
        c = eosVar3;
        eos eosVar4 = new eos("RESUME", 3);
        d = eosVar4;
        eos eosVar5 = new eos("FIX_PAYMENT", 4);
        e = eosVar5;
        eos eosVar6 = new eos("CONFIRM_PRICE_CHANGE", 5);
        f = eosVar6;
        eos eosVar7 = new eos("CONFIRM_PRICE_STEP_UP", 6);
        g = eosVar7;
        h = new eos[]{eosVar, eosVar2, eosVar3, eosVar4, eosVar5, eosVar6, eosVar7};
    }

    public static eos[] values() {
        return (eos[]) h.clone();
    }
}
