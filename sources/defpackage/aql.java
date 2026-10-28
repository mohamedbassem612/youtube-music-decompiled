package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aql extends aqh {
    final /* synthetic */ aqm d;

    public aql(aqm aqmVar) {
        this.d = aqmVar;
    }

    @Override // defpackage.aqh
    protected final String b() {
        aqi aqiVar = (aqi) this.d.a.get();
        if (aqiVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(aqiVar.a) + ']';
    }
}
