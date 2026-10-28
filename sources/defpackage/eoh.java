package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eoh {
    public int a;
    public int b;
    public String c;

    public final String toString() {
        int i = this.a;
        int i2 = eov.a;
        agkj agkjVar = eou.p;
        Integer numValueOf = Integer.valueOf(i);
        return "Response Code: " + (!agkjVar.containsKey(numValueOf) ? eou.RESPONSE_CODE_UNSPECIFIED : (eou) agkjVar.get(numValueOf)).toString() + ", Debug Message: " + this.c;
    }
}
