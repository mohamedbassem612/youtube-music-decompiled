package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abul implements Comparable {
    public static final abul a = new abul(-1, null);
    public final int b;
    public final Integer c;

    public abul(int i, Integer num) {
        this.b = i;
        this.c = num;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(abul abulVar) {
        abulVar.getClass();
        awqg[] awqgVarArr = {new yta(11), new yta(12)};
        for (int i = 0; i < 2; i++) {
            awqg awqgVar = awqgVarArr[i];
            int iF = atqq.f((Comparable) awqgVar.invoke(this), (Comparable) awqgVar.invoke(abulVar));
            if (iF != 0) {
                return iF;
            }
        }
        return 0;
    }

    public final abul b() {
        return new abul(this.b + 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abul) {
            abul abulVar = (abul) obj;
            if (this.b == abulVar.b && awrc.c(this.c, abulVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.c;
        return (this.b * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        Integer num = this.c;
        int i = this.b;
        if (num == null) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('.');
        sb.append(num);
        return sb.toString();
    }
}
