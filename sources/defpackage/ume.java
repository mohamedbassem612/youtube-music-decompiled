package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ume extends ept {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public ume(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ume)) {
            return false;
        }
        ume umeVar = (ume) obj;
        return Objects.equals(this.a, umeVar.a) && Objects.equals(this.b, umeVar.b) && Objects.equals(this.c, umeVar.c) && Objects.equals(this.d, umeVar.d) && Objects.equals(this.e, umeVar.e) && Objects.equals(this.f, umeVar.f);
    }

    public final int hashCode() {
        return (((((((((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e)) * 31) + Objects.hashCode(this.f);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d, this.e, this.f};
        String[] strArrSplit = "featuresConfig;playerDimensions;gestureConfig;timelinePanelCallback;mediaCompositionManager;activeStickerController".split(";");
        StringBuilder sb = new StringBuilder("ume[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
