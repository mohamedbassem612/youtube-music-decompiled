package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpt implements AutoCloseable {
    public final dpd a;

    public dpt(dpd dpdVar) {
        this.a = dpdVar;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    public final dpb a(String str) {
        String strSubstring;
        int i;
        str.getClass();
        dpd dpdVar = this.a;
        if (!dpdVar.h()) {
            wf.g(21, "connection is closed");
            throw new awmh();
        }
        String string = awrc.q(str).toString();
        string.getClass();
        int length = string.length() - 2;
        int i2 = -1;
        int i3 = 1;
        if (length >= 0) {
            int iIndexOf = 0;
            loop0: while (iIndexOf < length) {
                char cCharAt = string.charAt(iIndexOf);
                if (cCharAt > ' ') {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iIndexOf2 = iIndexOf + 1;
                            if (string.charAt(iIndexOf2) == '*') {
                                do {
                                    iIndexOf2 = string.indexOf(42, iIndexOf2 + 1);
                                    if (iIndexOf2 < 0) {
                                        break loop0;
                                    }
                                    i = iIndexOf2 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (string.charAt(i) != '/');
                                iIndexOf = iIndexOf2 + 2;
                            }
                        }
                        i2 = iIndexOf;
                        break;
                    }
                    if (string.charAt(iIndexOf + 1) != '-') {
                        i2 = iIndexOf;
                        break;
                    }
                    iIndexOf = string.indexOf(10, iIndexOf + 2);
                    if (iIndexOf < 0) {
                        break;
                    }
                }
                iIndexOf++;
            }
        }
        dpu dpuVar = null;
        if (i2 < 0 || i2 > string.length()) {
            strSubstring = null;
        } else {
            strSubstring = string.substring(i2, Math.min(i2 + 3, string.length()));
            strSubstring.getClass();
        }
        if (strSubstring == null) {
            return new dpw(dpdVar, str);
        }
        if (!"END".equalsIgnoreCase(strSubstring) && !"COM".equalsIgnoreCase(strSubstring)) {
            if ("ROL".equalsIgnoreCase(strSubstring)) {
                if (awrc.u(string, " TO ", true)) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
            } else if (!"BEG".equalsIgnoreCase(strSubstring)) {
                i3 = 0;
            } else if (awrc.u(string, "EXCLUSIVE", true)) {
                i3 = 3;
            } else {
                i3 = awrc.u(string, "IMMEDIATE", true) ? 4 : 5;
            }
        }
        if (i3 != 0) {
            return new dpz(dpdVar, str, i3);
        }
        if ("PRA".equalsIgnoreCase(strSubstring)) {
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (awrc.u(awrc.s(lowerCase, "journal_mode", ""), "=", false)) {
                dpuVar = dpu.a;
            }
        }
        if (dpuVar instanceof dpu) {
            return new dpv(dpdVar, str, new dpy(dpdVar, str));
        }
        return ("SEL".equalsIgnoreCase(strSubstring) || "PRA".equalsIgnoreCase(strSubstring) || "WIT".equalsIgnoreCase(strSubstring)) ? new dpy(dpdVar, str) : new dpw(dpdVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
