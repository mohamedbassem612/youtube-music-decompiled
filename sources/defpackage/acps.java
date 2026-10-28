package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acps implements awql {
    @Override // defpackage.awql
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        Boolean bool3 = (Boolean) obj3;
        bool.getClass();
        bool2.getClass();
        bool3.getClass();
        boolean zBooleanValue = bool.booleanValue();
        boolean z = true;
        if (!zBooleanValue && (bool2.booleanValue() || bool3.booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
