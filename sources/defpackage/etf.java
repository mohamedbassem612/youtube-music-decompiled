package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class etf extends ahch implements feb {
    public fea a;

    @Override // defpackage.feb
    public final boolean c(ewb ewbVar, fem femVar) {
        Throwable runtimeException = ewbVar;
        if (ewbVar == null) {
            runtimeException = new RuntimeException("Unknown error");
        }
        super.setException(runtimeException);
        return true;
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        fea feaVar;
        boolean zCancel = super.cancel(z);
        if (!zCancel) {
            return zCancel;
        }
        synchronized (this) {
            feaVar = this.a;
        }
        if (feaVar == null) {
            return zCancel;
        }
        feaVar.cancel(z);
        return true;
    }

    @Override // defpackage.feb
    public final boolean gJ(Object obj, fem femVar, int i) {
        try {
            super.set(new elr(obj, (byte[]) null));
            return true;
        } catch (Throwable th) {
            super.setException(th);
            return true;
        }
    }

    @Override // defpackage.ahch
    protected final String jK() {
        fea feaVar;
        synchronized (this) {
            feaVar = this.a;
        }
        if (feaVar != null) {
            return a.cn((byte) 93, feaVar, "activeTarget=[");
        }
        return null;
    }
}
