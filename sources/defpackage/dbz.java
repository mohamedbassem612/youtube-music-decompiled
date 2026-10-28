package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dbz extends dbi implements Comparable {
    public long b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dbz dbzVar = (dbz) obj;
        if (isEndOfStream() == dbzVar.isEndOfStream()) {
            long j = this.timeUs - dbzVar.timeUs;
            if (j == 0) {
                j = this.b - dbzVar.b;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!isEndOfStream()) {
            return -1;
        }
        return 1;
    }
}
