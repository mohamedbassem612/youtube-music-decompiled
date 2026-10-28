package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awxj extends axdv implements Runnable {
    public final long b;

    public awxj(long j, awoq awoqVar) {
        super(awoqVar.getContext(), awoqVar);
        this.b = j;
    }

    @Override // defpackage.awtt, defpackage.awwk
    public final String kB() {
        return super.kB() + "(timeMillis=" + this.b + ')';
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    @Override // java.lang.Runnable
    public final void run() {
        String strCf;
        awou awouVar = ((awtt) this).a;
        awvb awvbVarA = avkz.A(awouVar);
        awus awusVar = (awus) awouVar.get(awus.b);
        String str = awusVar != null ? awusVar.a : null;
        long j = this.b;
        awvd awvdVar = awvbVarA instanceof awvd ? (awvd) awvbVarA : null;
        if (awvdVar != null) {
            int i = awtl.b;
            awrc.j(j, awtn.MILLISECONDS);
            strCf = awvdVar.a();
            if (strCf == null) {
                strCf = a.cf(j, "Timed out waiting for ", " ms");
            }
        } else {
            strCf = a.cf(j, "Timed out waiting for ", " ms");
        }
        if (str != null) {
            if (strCf.length() > 0) {
                char lowerCase = Character.toLowerCase(strCf.charAt(0));
                String strSubstring = strCf.substring(1);
                strSubstring.getClass();
                strCf = lowerCase + strSubstring;
            }
            strCf = a.ca(strCf, str, "Coroutine \"", "\" ");
        }
        I(new awxi(strCf, this));
    }
}
