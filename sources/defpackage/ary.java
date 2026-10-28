package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ary {
    public final boolean a;
    final String b;
    public int c;
    public float d;
    public String e;
    boolean f;
    public int g;
    public final int h;

    public ary(ary aryVar, Object obj) {
        this.a = false;
        this.b = aryVar.b;
        this.h = aryVar.h;
        a(obj);
    }

    public final void a(Object obj) {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                this.c = ((Integer) obj).intValue();
                return;
        }
    }

    public ary(String str, int i, Object obj, boolean z) {
        this.b = str;
        this.h = i;
        this.a = z;
        a(obj);
    }
}
