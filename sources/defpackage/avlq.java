package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avlq {
    public static final avlq a = new avlq(null);
    public final Object b;

    private avlq(Object obj) {
        this.b = obj;
    }

    public static avlq a(Throwable th) {
        th.getClass();
        return new avlq(new awkj(th));
    }

    public static avlq b(Object obj) {
        obj.getClass();
        return new avlq(obj);
    }

    public final Throwable c() {
        Object obj = this.b;
        if (obj instanceof awkj) {
            return awkl.a(obj);
        }
        return null;
    }

    public final boolean d() {
        return this.b instanceof awkj;
    }

    public final boolean e() {
        Object obj = this.b;
        return (obj == null || (obj instanceof awkj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avlq) {
            return a.ae(this.b, ((avlq) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!(obj instanceof awkj)) {
            return a.cn((byte) 93, obj, "OnNextNotification[");
        }
        return "OnErrorNotification[" + String.valueOf(awkl.a(obj)) + ']';
    }
}
