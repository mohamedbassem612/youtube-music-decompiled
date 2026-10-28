package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auke extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public auke(int i) {
        String strBR;
        switch (i) {
            case 0:
                strBR = "VR Service present";
                break;
            case 1:
                strBR = "VR Service missing";
                break;
            case 2:
                strBR = "VR Service disabled";
                break;
            case 3:
                strBR = "VR Service updating";
                break;
            case 4:
                strBR = "VR Service obsolete";
                break;
            case 5:
                strBR = "VR Service not connected";
                break;
            case 6:
                strBR = "No permission to do operation";
                break;
            case 7:
                strBR = "This operation is not supported on this device";
                break;
            case 8:
                strBR = "An unknown failure occurred";
                break;
            default:
                strBR = a.bR(i, "Invalid connection result: ");
                break;
        }
        super(strBR);
    }
}
