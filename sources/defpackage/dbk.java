package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbk implements dbl {
    private final /* synthetic */ int $cid;

    public dbk(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r2.equals("application/vobsub") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r2.equals("application/x-quicktime-tx3g") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r2.equals("application/x-mp4-vtt") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r2.equals("application/pgs") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r2.equals("application/dvbsubs") != false) goto L35;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.dbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.bse r3) {
        /*
            r2 = this;
            int r2 = r2.$cid
            r0 = 1
            if (r2 == 0) goto L74
            java.lang.String r2 = r3.q
            if (r2 == 0) goto L64
            int r3 = r2.hashCode()
            r1 = 2
            switch(r3) {
                case -1351681404: goto L5a;
                case -1248334819: goto L51;
                case -1026075066: goto L48;
                case -1004728940: goto L3f;
                case 691401887: goto L36;
                case 822864842: goto L2d;
                case 1157994102: goto L24;
                case 1668750253: goto L1b;
                case 1693976202: goto L12;
                default: goto L11;
            }
        L11:
            goto L64
        L12:
            java.lang.String r3 = "application/ttml+xml"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L74
        L1b:
            java.lang.String r3 = "application/x-subrip"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L74
        L24:
            java.lang.String r3 = "application/vobsub"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L62
        L2d:
            java.lang.String r3 = "text/x-ssa"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L74
        L36:
            java.lang.String r3 = "application/x-quicktime-tx3g"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L62
        L3f:
            java.lang.String r3 = "text/vtt"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L74
        L48:
            java.lang.String r3 = "application/x-mp4-vtt"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L62
        L51:
            java.lang.String r3 = "application/pgs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L62
        L5a:
            java.lang.String r3 = "application/dvbsubs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
        L62:
            r0 = r1
            goto L74
        L64:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbk.a(bse):int");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.dbl
    public final dbn b(bse bseVar) {
        if (this.$cid == 0) {
            throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
        String str = bseVar.q;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new dcf(bseVar.t);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new dch();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new dcz();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new ddh();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new dcw(bseVar.t);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new dcj(bseVar.t);
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return new dcy(bseVar.t);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new dcn(bseVar);
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new dcs();
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.dbl
    public final boolean c(bse bseVar) {
        if (this.$cid == 0) {
            return false;
        }
        String str = bseVar.q;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
