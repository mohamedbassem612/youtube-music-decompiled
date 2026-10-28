package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwc {
    public final int a;
    private final int b;

    public acwc(byte[] bArr) {
        this.a = 2;
        this.b = 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acwc) {
            acwc acwcVar = (acwc) obj;
            int i = this.a;
            int i2 = acwcVar.a;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.b;
                int i4 = acwcVar.b;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.by(i);
        int i2 = this.b;
        a.bj(i2);
        return ((((((((((i ^ (-1707124817)) * 1000003) ^ i2) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.a;
        String str = "null";
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.b;
        if (i2 == 1) {
            str = "BOTTOM_SHEET";
        } else if (i2 == 2) {
            str = "SIDE_SHEET";
        } else if (i2 == 3) {
            str = "FULL_SCREEN";
        }
        return a.ct(str, string, "Options{enableShowPageTitle=false, enableShowOpenInBrowserButton=false, useOpenAppHandler=false, enableIncognitoMode=false, direction=", ", customTabType=", ", disableMultitasking=false, enableExpandOnScroll=false, disableSendToExternalHandler=false, enableTransparentLoadingBackground=false}");
    }

    public acwc() {
        throw null;
    }
}
