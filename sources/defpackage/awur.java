package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awur extends awom implements awxg {
    public static final awxp b = new awxp();
    public final long a;

    public awur(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.awxg
    public final /* bridge */ /* synthetic */ Object a(awou awouVar) {
        awus awusVar = (awus) awouVar.get(awus.b);
        String str = awusVar != null ? awusVar.a : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iO = awrc.o(name);
        name.getClass();
        int iLastIndexOf = name.lastIndexOf(" @", iO);
        if (iLastIndexOf < 0) {
            iLastIndexOf = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iLastIndexOf + 10);
        String strSubstring = name.substring(0, iLastIndexOf);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.awxg
    public final /* bridge */ /* synthetic */ void c(awou awouVar, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof awur) && this.a == ((awur) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return a.ak(this.a);
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ')';
    }
}
