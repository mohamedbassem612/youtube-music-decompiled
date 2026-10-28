package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yol {
    public final List a;
    public final List b;

    public yol(List list, List list2) {
        if (list == null) {
            throw new NullPointerException("Null videoFormatStreams");
        }
        this.a = list;
        if (list2 == null) {
            throw new NullPointerException("Null audioFormatStreams");
        }
        this.b = list2;
    }

    public static wgs a(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, List list, axo axoVar) {
        wgs wgsVarC = zic.c(formatIdOuterClass$FormatId, list);
        if (wgsVarC == null) {
            boolean zIsEmpty = list.isEmpty();
            zhv zhvVar = new zhv(true != zIsEmpty ? "player.exception" : "player.fatalexception");
            zhvVar.e = zIsEmpty;
            zhvVar.f("c", "fmtMissing");
            zhvVar.f("fmt", formatIdOuterClass$FormatId.c + '_' + formatIdOuterClass$FormatId.e + '_' + formatIdOuterClass$FormatId.d);
            axoVar.accept(zhvVar.a());
        }
        return wgsVarC;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yol) {
            yol yolVar = (yol) obj;
            if (this.a.equals(yolVar.a) && this.b.equals(yolVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        List list = this.b;
        return "SupportedFormatStreams{videoFormatStreams=" + this.a.toString() + ", audioFormatStreams=" + list.toString() + '}';
    }

    public yol() {
        throw null;
    }
}
