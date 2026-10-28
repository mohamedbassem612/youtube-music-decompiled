package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbi extends fgc {
    public static final acbi b = new acbi();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fgc
    public final fge b(String str) {
        aulz aulzVar;
        switch (str.hashCode()) {
            case 3346442:
                if (str.equals("mdat")) {
                    return new fgk();
                }
                return new fgh(str);
            case 3357433:
                if (str.equals("moof")) {
                    aulzVar = new aulz("moof");
                    break;
                }
                return new fgh(str);
            case 3357449:
                if (str.equals("moov")) {
                    aulzVar = new aulz("moov");
                    break;
                }
                return new fgh(str);
            case 3363941:
                if (str.equals("mvhd")) {
                    return new fgg();
                }
                return new fgh(str);
            case 3556994:
                if (str.equals("tfdt")) {
                    return new fgi();
                }
                return new fgh(str);
            case 3568419:
                if (str.equals("traf")) {
                    return new fgj();
                }
                return new fgh(str);
            default:
                return new fgh(str);
        }
        return aulzVar;
    }
}
