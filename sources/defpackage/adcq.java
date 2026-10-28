package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adcq extends fky {

    @fmt(a = 13)
    avmm a;

    @fmt(a = 13)
    aigj b;

    @fmt(a = 13)
    adcw c;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        Object obj = aeroVar.b;
        if (aeroVar.a == 0) {
            aigj aigjVar = this.b;
            Object[] objArr = (Object[]) obj;
            adcw adcwVar = (adcw) objArr[0];
            String str = (String) objArr[1];
            aigj aigjVar2 = (aigj) objArr[2];
            if (str != null && aigjVar2 != null) {
                if (adcwVar != null && ((!adcwVar.f || !adcwVar.g) && Objects.equals(str, "suspense_placeholder_data_key"))) {
                    adcwVar.d(null, null);
                }
                aigjVar = aigjVar2;
            }
            this.b = aigjVar;
        }
    }
}
