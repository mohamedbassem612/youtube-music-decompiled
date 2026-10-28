package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awyi {
    public static final awyh a = new awyh();
    public final Object b;

    public /* synthetic */ awyi(Object obj) {
        this.b = obj;
    }

    public static final Throwable a(Object obj) {
        awyg awygVar = obj instanceof awyg ? (awyg) obj : null;
        if (awygVar != null) {
            return awygVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awyi) && awrc.c(this.b, ((awyi) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        if (obj instanceof awyg) {
            return ((awyg) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
