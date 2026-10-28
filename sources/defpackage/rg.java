package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rg {
    final /* synthetic */ qe g;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    private final Map h = new LinkedHashMap();
    public final List c = new ArrayList();
    public final transient Map d = new LinkedHashMap();
    public final Map e = new LinkedHashMap();
    public final Bundle f = new Bundle();

    public rg(qe qeVar) {
        this.g = qeVar;
    }

    private final void g(String str) {
        if (((Integer) this.b.get(str)) == null) {
            Iterator itA = awqx.e(new awsw(new aho(1), new xzn(14))).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    c(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final rc a(String str, rj rjVar, rb rbVar) {
        g(str);
        this.d.put(str, new qv(rbVar, rjVar));
        Map map = this.e;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            rbVar.a(obj);
        }
        Bundle bundle = this.f;
        ra raVar = (ra) aie.i(bundle, str, ra.class);
        if (raVar != null) {
            bundle.remove(str);
            rbVar.a(rjVar.b(raVar.a, raVar.b));
        }
        return new rf(this, str, rjVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public final rc b(final String str, bog bogVar, final rj rjVar, final rb rbVar) {
        str.getClass();
        rjVar.getClass();
        rbVar.getClass();
        boc lifecycle = bogVar.getLifecycle();
        if (lifecycle.a().a(bob.d)) {
            throw new IllegalStateException("LifecycleOwner " + bogVar + " is attempting to register while current state is " + lifecycle.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        Map map = this.h;
        boy boyVar = (boy) map.get(str);
        if (boyVar == null) {
            boyVar = new boy(lifecycle);
        }
        boe boeVar = new boe() { // from class: rd
            @Override // defpackage.boe
            public final void a(bog bogVar2, boa boaVar) {
                rg rgVar = this.a;
                String str2 = str;
                if (boa.ON_START != boaVar) {
                    if (boa.ON_STOP == boaVar) {
                        rgVar.d.remove(str2);
                        return;
                    } else {
                        if (boa.ON_DESTROY == boaVar) {
                            rgVar.d(str2);
                            return;
                        }
                        return;
                    }
                }
                rj rjVar2 = rjVar;
                rb rbVar2 = rbVar;
                rgVar.d.put(str2, new qv(rbVar2, rjVar2));
                Map map2 = rgVar.e;
                if (map2.containsKey(str2)) {
                    Object obj = map2.get(str2);
                    map2.remove(str2);
                    rbVar2.a(obj);
                }
                Bundle bundle = rgVar.f;
                ra raVar = (ra) aie.i(bundle, str2, ra.class);
                if (raVar != null) {
                    bundle.remove(str2);
                    rbVar2.a(rjVar2.b(raVar.a, raVar.b));
                }
            }
        };
        ((boc) boyVar.b).b(boeVar);
        boyVar.a.add(boeVar);
        map.put(str, boyVar);
        return new re(this, str, rjVar);
    }

    public final void c(int i, String str) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void d(String str) {
        Integer num;
        if (!this.c.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        Map map = this.e;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ra) aie.i(bundle, str, ra.class)));
            bundle.remove(str);
        }
        Map map2 = this.h;
        boy boyVar = (boy) map2.get(str);
        if (boyVar != null) {
            ?? r1 = boyVar.a;
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((boc) boyVar.b).c((boe) it.next());
            }
            r1.clear();
            map2.remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, rb] */
    public final boolean e(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        qv qvVar = (qv) this.d.get(str);
        if ((qvVar != null ? qvVar.a : null) != null) {
            List list = this.c;
            if (list.contains(str)) {
                qvVar.a.a(((rj) qvVar.b).b(i2, intent));
                list.remove(str);
            } else {
                this.e.remove(str);
                this.f.putParcelable(str, new ra(i2, intent));
            }
        } else {
            this.e.remove(str);
            this.f.putParcelable(str, new ra(i2, intent));
        }
        return true;
    }

    public final void f(int i, rj rjVar, Object obj, aad aadVar) {
        Bundle bundleC;
        qe qeVar = this.g;
        zf zfVarC = rjVar.c(qeVar, obj);
        if (zfVarC != null) {
            new Handler(Looper.getMainLooper()).post(new qd(this, i, zfVarC, 0, (byte[]) null));
            return;
        }
        Intent intentA = rjVar.a(qeVar, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(qeVar.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleC = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleC = aadVar != null ? aadVar.c() : null;
        }
        Bundle bundle = bundleC;
        if (awrc.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            atb.a(qeVar, stringArrayExtra, i);
            return;
        }
        if (!awrc.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
            qeVar.startActivityForResult(intentA, i, bundle);
            return;
        }
        ri riVar = (ri) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            riVar.getClass();
            qeVar.startIntentSenderForResult(riVar.a, i, riVar.b, riVar.c, riVar.d, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new qd(this, i, e, 2));
        }
    }

    public rg() {
    }
}
