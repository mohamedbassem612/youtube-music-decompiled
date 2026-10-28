package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acka {
    public String a;
    public byte[] b;
    public acjw c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ajtt h;
    public akek i;
    private Object j;

    public final ackb a() {
        acjw acjwVar = this.c;
        Object obj = this.j;
        String strConcat = acjwVar == null ? " type" : "";
        if (obj == null) {
            strConcat = strConcat.concat(" continuation");
        }
        if (strConcat.isEmpty()) {
            return new ackb(this.a, this.b, acjwVar, obj, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final void b(Object obj) {
        obj.getClass();
        this.j = obj;
    }
}
