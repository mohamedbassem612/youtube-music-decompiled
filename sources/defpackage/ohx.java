package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohx {
    public static final ohx a;
    public static final ohx b;
    public static final ohx c;
    private static final /* synthetic */ ohx[] d;

    static {
        ohx ohxVar = new ohx("SUCCESS", 0);
        a = ohxVar;
        ohx ohxVar2 = new ohx("FAILURE", 1);
        b = ohxVar2;
        ohx ohxVar3 = new ohx("FAILURE_KEEP_PENDING", 2);
        c = ohxVar3;
        d = new ohx[]{ohxVar, ohxVar2, ohxVar3};
    }

    public static ohx[] values() {
        return (ohx[]) d.clone();
    }
}
