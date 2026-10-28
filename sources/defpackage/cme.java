package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cme implements cmf {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.cmf
    public final cxm a(bse bseVar) {
        String str = bseVar.q;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        return new cxs();
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        return new cxw();
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        return new cyg(null);
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        return new cxu();
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        return new cyt();
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.cmf
    public final boolean b(bse bseVar) {
        String str = bseVar.q;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
