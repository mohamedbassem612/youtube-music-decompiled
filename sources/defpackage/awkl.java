package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum awkl {
    COMPLETE;

    public static Throwable a(Object obj) {
        return ((awkj) obj).a;
    }

    public static boolean b(Object obj, avlw avlwVar) {
        if (obj == COMPLETE) {
            avlwVar.kn();
            return true;
        }
        if (obj instanceof awkj) {
            avlwVar.b(((awkj) obj).a);
            return true;
        }
        avlwVar.kk(obj);
        return false;
    }

    public static boolean c(Object obj, avlw avlwVar) {
        boolean z = true;
        if (obj == COMPLETE) {
            avlwVar.kn();
        } else if (obj instanceof awkj) {
            avlwVar.b(((awkj) obj).a);
        } else {
            z = false;
            if (obj instanceof awki) {
                avlwVar.d(((awki) obj).a);
            } else {
                avlwVar.kk(obj);
            }
        }
        return z;
    }

    public static boolean d(Object obj) {
        return obj == COMPLETE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
