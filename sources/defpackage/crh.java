package defpackage;

import java.io.FileNotFoundException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class crh implements crj {
    @Override // defpackage.crj
    public final int a(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // defpackage.crj
    public final long c(aae aaeVar) {
        for (Object cause = aaeVar.c; cause != null; cause = ((Throwable) cause).getCause()) {
            if ((cause instanceof bsz) || (cause instanceof FileNotFoundException) || (cause instanceof bys) || (cause instanceof cro) || ((cause instanceof byf) && ((byf) cause).a == 2008)) {
                return -9223372036854775807L;
            }
        }
        return Math.min((aaeVar.a - 1) * 1000, 5000);
    }

    @Override // defpackage.crj
    public final yvt d(cri criVar, aae aaeVar) {
        int i;
        Object obj = aaeVar.c;
        if ((obj instanceof byv) && ((i = ((byv) obj).d) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503)) {
            if (criVar.e) {
                if (criVar.a(2)) {
                    return new yvt(2, 60000L, null, null, null);
                }
                if (criVar.a(1)) {
                    return new yvt(1, 300000L, null, null, null);
                }
            } else {
                if (criVar.a(1)) {
                    return new yvt(1, 300000L, null, null, null);
                }
                if (criVar.a(2)) {
                    return new yvt(2, 60000L, null, null, null);
                }
            }
        }
        return null;
    }

    @Override // defpackage.crj
    public final /* synthetic */ void b(long j) {
    }
}
