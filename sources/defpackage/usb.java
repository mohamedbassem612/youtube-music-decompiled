package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usb {
    public final augy a;
    private final qvs b;

    public usb(augy augyVar, qvs qvsVar) {
        if (augyVar == null) {
            throw new NullPointerException("Null editorSegment");
        }
        this.a = augyVar;
        if (qvsVar == null) {
            throw new NullPointerException("Null mediaEngineSegment");
        }
        this.b = qvsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof usb) {
            usb usbVar = (usb) obj;
            if (this.a.equals(usbVar.a) && this.b.equals(usbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        qvs qvsVar = this.b;
        return "GraphicalSegmentEntry{editorSegment=" + this.a.toString() + ", mediaEngineSegment=" + qvsVar.toString() + '}';
    }

    public usb() {
        throw null;
    }
}
