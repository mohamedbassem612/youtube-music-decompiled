package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class auo extends auu {
    public final List a = new ArrayList();
    public int b = 0;

    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MetricStyle";
    }

    @Override // defpackage.auu
    public final void b(Bundle bundle) {
        auk aulVar;
        super.b(bundle);
        this.a.clear();
        ArrayList arrayListJ = aie.j(bundle, "android.metrics", Bundle.class);
        if (arrayListJ != null) {
            int size = arrayListJ.size();
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) arrayListJ.get(i);
                if (bundle2 != null) {
                    Bundle bundle3 = bundle2.getBundle("value");
                    aum aumVar = null;
                    if (bundle3 != null) {
                        switch (bundle3.getInt("_type")) {
                            case 1:
                                Instant instantOfEpochMilli = bundle3.containsKey("zeroTime") ? Instant.ofEpochMilli(bundle3.getLong("zeroTime")) : null;
                                Long lValueOf = bundle3.containsKey("zeroElapsedRealtime") ? Long.valueOf(bundle3.getLong("zeroElapsedRealtime")) : null;
                                Duration durationOfMillis = bundle3.containsKey("pausedDuration") ? Duration.ofMillis(bundle3.getLong("pausedDuration")) : null;
                                aulVar = (instantOfEpochMilli != null || lValueOf != null || durationOfMillis != null) ? new aul(instantOfEpochMilli, lValueOf, durationOfMillis, bundle3.getBoolean("countDown"), bundle3.getInt("format")) : null;
                                break;
                            case 2:
                                LocalDate localDateOfEpochDay = bundle3.containsKey("value") ? LocalDate.ofEpochDay(bundle3.getLong("value")) : null;
                                aulVar = localDateOfEpochDay != null ? new auf(localDateOfEpochDay, bundle3.getInt("format", 0)) : null;
                                break;
                            case 3:
                                LocalTime localTimeOfSecondOfDay = bundle3.containsKey("value") ? LocalTime.ofSecondOfDay(bundle3.getLong("value")) : null;
                                aulVar = localTimeOfSecondOfDay != null ? new auj(localTimeOfSecondOfDay) : null;
                                break;
                            case 4:
                                aulVar = new auh(bundle3.getInt("value"), bundle3.getString("unit"));
                                break;
                            case 5:
                                aulVar = new aug(bundle3.getFloat("value"), bundle3.getString("unit"), bundle3.getInt("minDigits", 0), bundle3.getInt("maxDigits", 2));
                                break;
                            case 6:
                                aulVar = new aui(bundle3.getString("value", ""), bundle3.getString("unit"));
                                break;
                            default:
                                aulVar = null;
                                break;
                        }
                        if (aulVar != null) {
                            aumVar = new aum(aulVar, bundle2.getString("label"), bundle2.getInt("semanticStyle", 0));
                        }
                    }
                    if (aumVar != null) {
                        g(aumVar);
                    }
                }
            }
        }
        this.b = bundle.getInt("android.metrics.criticalIndex", 0);
    }

    public final List e() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auo)) {
            return false;
        }
        auo auoVar = (auo) obj;
        return this == auoVar || (Objects.equals(this.a, auoVar.a) && this.b == auoVar.b);
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        if (this.a.isEmpty()) {
            throw new IllegalArgumentException("A MetricStyle must have at least one Metric");
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ((Notification.Builder) depVar.c).setStyle(aun.s(this));
        }
    }

    public final void g(aum aumVar) {
        this.a.add(aumVar);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    @Override // defpackage.auu
    public final void i(Bundle bundle) {
        super.i(bundle);
        if (Build.VERSION.SDK_INT < 37) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (aum aumVar : this.a) {
                Bundle bundle2 = new Bundle();
                auk aukVar = aumVar.a;
                Bundle bundle3 = new Bundle();
                if (aukVar instanceof aul) {
                    bundle3.putInt("_type", 1);
                } else if (aukVar instanceof auf) {
                    bundle3.putInt("_type", 2);
                } else if (aukVar instanceof auj) {
                    bundle3.putInt("_type", 3);
                } else if (aukVar instanceof auh) {
                    bundle3.putInt("_type", 4);
                } else if (aukVar instanceof aug) {
                    bundle3.putInt("_type", 5);
                } else {
                    if (!(aukVar instanceof aui)) {
                        java.util.Objects.toString(aukVar);
                        throw new AssertionError("Impossible MetricValue subclass: ".concat(aukVar.toString()));
                    }
                    bundle3.putInt("_type", 6);
                }
                aukVar.a(bundle3);
                bundle2.putBundle("value", bundle3);
                bundle2.putString("label", aumVar.b);
                bundle2.putInt("semanticStyle", aumVar.c);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("android.metrics", arrayList);
            bundle.putInt("android.metrics.criticalIndex", this.b);
        }
    }

    public final String toString() {
        return "MetricStyle{mMetrics=" + this.a + ", mCriticalMetric=" + this.b + '}';
    }
}
