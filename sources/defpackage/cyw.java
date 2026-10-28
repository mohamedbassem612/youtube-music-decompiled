package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyw implements bsw {
    public final String a;
    public final String b;

    public cyw(String str, String str2) {
        this.a = ahno.af(str);
        this.b = str2;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.bsw
    public final void b(bsu bsuVar) {
        Integer numT;
        Integer numT2;
        Integer numT3;
        Integer numT4;
        String str = this.a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numT = ahng.T(this.b)) != null) {
                    bsuVar.i = numT;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numT2 = ahng.T(this.b)) != null) {
                    bsuVar.w = numT2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numT3 = ahng.T(this.b)) != null) {
                    bsuVar.h = numT3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    bsuVar.c = this.b;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    bsuVar.x = this.b;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    bsuVar.a = this.b;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    bsuVar.e = this.b;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    bsuVar.u = this.b;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numT4 = ahng.T(this.b)) != null) {
                    bsuVar.v = numT4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    bsuVar.d = this.b;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    bsuVar.b = this.b;
                }
                break;
        }
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyw cywVar = (cyw) obj;
            if (this.a.equals(cywVar.a) && this.b.equals(cywVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VC: " + this.a + '=' + this.b;
    }
}
