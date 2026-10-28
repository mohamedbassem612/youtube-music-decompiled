package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npb extends DebuggerCallback implements Application.ActivityLifecycleCallbacks, nsu {
    public static final /* synthetic */ int e = 0;
    public final Handler b;
    public final npl c;
    public final awmd d;
    private final agev f;
    private final npa g;
    private Subscription i;
    private FaultSubscription j;
    public final Set a = new HashSet();
    private final Object h = new Object();
    private final Observer k = new noy(this);
    private final FaultObserver l = new noz(this);

    public npb(Context context, awmd awmdVar, agev agevVar) {
        Application application;
        fna.a = true;
        this.d = awmdVar;
        this.c = new npl();
        this.b = new Handler(Looper.getMainLooper());
        this.f = agevVar;
        this.g = new npa(this);
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else if (context instanceof Activity) {
            application = ((Activity) context).getApplication();
        } else {
            if (!(context instanceof Service)) {
                throw new IllegalStateException("Could not get Application from context");
            }
            application = ((Service) context).getApplication();
        }
        if (application == null) {
            throw new IllegalStateException("Failed to fetch Application");
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public static asrn d(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return null;
        }
        aihf aihfVarCreateBuilder = asrn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asrn asrnVar = (asrn) aihfVarCreateBuilder.instance;
        asrnVar.b |= 1;
        asrnVar.c = f;
        aihfVarCreateBuilder.copyOnWrite();
        asrn asrnVar2 = (asrn) aihfVarCreateBuilder.instance;
        asrnVar2.b |= 2;
        asrnVar2.d = f2;
        aihfVarCreateBuilder.copyOnWrite();
        asrn asrnVar3 = (asrn) aihfVarCreateBuilder.instance;
        asrnVar3.b |= 4;
        asrnVar3.e = f3;
        aihfVarCreateBuilder.copyOnWrite();
        asrn asrnVar4 = (asrn) aihfVarCreateBuilder.instance;
        asrnVar4.b |= 8;
        asrnVar4.f = f4;
        return (asrn) aihfVarCreateBuilder.build();
    }

    public static void f(View view, List list) {
        if (view.isShown()) {
            if (view instanceof fjw) {
                list.add(view);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), list);
                }
            }
        }
    }

    public static aihf g(Snapshot snapshot, Set set) {
        aihf aihfVarCreateBuilder = asrx.a.createBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            aihf aihfVarCreateBuilder2 = asrw.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            asrw asrwVar = (asrw) aihfVarCreateBuilder2.instance;
            str.getClass();
            asrwVar.b |= 1;
            asrwVar.c = str;
            byte[] bArrFindNoCopy = snapshot.findNoCopy(str);
            if (bArrFindNoCopy != null) {
                aigj aigjVarV = aigj.v(bArrFindNoCopy);
                aihfVarCreateBuilder2.copyOnWrite();
                asrw asrwVar2 = (asrw) aihfVarCreateBuilder2.instance;
                aigjVarV.getClass();
                asrwVar2.b |= 2;
                asrwVar2.d = aigjVarV;
            }
            asrw asrwVar3 = (asrw) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asrx asrxVar = (asrx) aihfVarCreateBuilder.instance;
            asrwVar3.getClass();
            aiie aiieVar = asrxVar.c;
            if (!aiieVar.c()) {
                asrxVar.c = aihn.mutableCopy(aiieVar);
            }
            asrxVar.c.add(asrwVar3);
        }
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    static boolean h(aihh aihhVar, Map map, Set set) {
        boolean z;
        asrl asrlVar;
        asow asowVar = ((asmv) aihhVar.instance).c;
        if (asowVar == null) {
            asowVar = asow.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ahxt.b);
        asowVar.c(aihlVarCheckIsLite);
        if (asowVar.j.n(aihlVarCheckIsLite.d)) {
            asod asodVar = ((asmv) aihhVar.instance).d;
            if (asodVar == null) {
                asodVar = asod.a;
            }
            String strF = npi.f(asodVar);
            if (strF == null || (asrlVar = (asrl) map.remove(strF.concat(":0"))) == null) {
                z = false;
            } else {
                asmv asmvVar = asrlVar.e;
                if (asmvVar == null) {
                    asmvVar = asmv.a;
                }
                aihhVar.copyOnWrite();
                asmv asmvVar2 = (asmv) aihhVar.instance;
                asmvVar.getClass();
                asmvVar2.d();
                asmvVar2.e.add(asmvVar);
                set.add(asrlVar);
                z = true;
            }
        } else {
            z = false;
        }
        for (int i = 0; i < ((asmv) aihhVar.instance).e.size(); i++) {
            aihh aihhVar2 = (aihh) aihhVar.t(i).toBuilder();
            if (h(aihhVar2, map, set)) {
                asmv asmvVar3 = (asmv) aihhVar2.build();
                aihhVar.copyOnWrite();
                asmv asmvVar4 = (asmv) aihhVar.instance;
                asmvVar3.getClass();
                asmvVar4.d();
                asmvVar4.e.set(i, asmvVar3);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01a3 A[EDGE_INSN: B:112:0x01a3->B:76:0x01a3 BREAK  A[LOOP:5: B:67:0x0179->B:75:0x019f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0169  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b5  */
    static void j(View view, aihf aihfVar, DisplayMetrics displayMetrics, DebuggerClient debuggerClient) {
        asrp asrpVar;
        asrl asrlVar;
        asmv asmvVar;
        aihh aihhVar;
        int size;
        asmv asmvVar2;
        asmv asmvVar3;
        asrl asrlVarCD;
        asmv asmvVar4;
        if (view == null || !view.isShown()) {
            return;
        }
        if (!(view instanceof fjw)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    j(viewGroup.getChildAt(i), aihfVar, displayMetrics, debuggerClient);
                }
                return;
            }
            return;
        }
        fjw fjwVar = (fjw) view;
        String strG = npi.g(fjwVar);
        if (strG == null) {
            strG = "";
        }
        aihf aihfVarCreateBuilder = asrp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asrp asrpVar2 = (asrp) aihfVarCreateBuilder.instance;
        asrpVar2.b |= 1;
        asrpVar2.d = strG;
        npi.i(fjwVar, new nph(aihfVarCreateBuilder, displayMetrics, 1));
        aiie aiieVar = ((asrp) aihfVarCreateBuilder.build()).c;
        int i2 = 0;
        while (true) {
            asrpVar = null;
            if (i2 >= aiieVar.size()) {
                asrlVar = null;
                asmvVar = null;
                break;
            }
            asrlVar = (asrl) aiieVar.get(i2);
            asmvVar = asrlVar.e;
            if (asmvVar == null) {
                asmvVar = asmv.a;
            }
            if (asmvVar == null) {
                asmvVar = null;
                break;
            }
            if (!m(asmvVar)) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(asmvVar);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        asmvVar = null;
                        break;
                    }
                    asmvVar = (asmv) arrayDeque.remove();
                    if (m(asmvVar)) {
                        break;
                    } else {
                        arrayDeque.addAll(asmvVar.e);
                    }
                }
            }
            if (asmvVar != null) {
                break;
            } else {
                i2++;
            }
        }
        List<asrl> listUnmodifiableList = DesugarCollections.unmodifiableList(((asrp) aihfVarCreateBuilder.instance).c);
        if (!listUnmodifiableList.isEmpty()) {
            HashMap map = new HashMap();
            for (asrl asrlVar2 : listUnmodifiableList) {
                asmv asmvVar5 = asrlVar2.e;
                if (asmvVar5 == null) {
                    asmvVar5 = asmv.a;
                }
                asod asodVar = asmvVar5.d;
                if (asodVar == null) {
                    asodVar = asod.a;
                }
                String strF = npi.f(asodVar);
                if (strF != null) {
                    map.put(strF, asrlVar2);
                }
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < ((asrp) aihfVarCreateBuilder.instance).c.size(); i3++) {
                asrl asrlVarCD2 = aihfVarCreateBuilder.cD(i3);
                asmv asmvVar6 = asrlVarCD2.e;
                if (asmvVar6 == null) {
                    asmvVar6 = asmv.a;
                }
                aihh aihhVar2 = (aihh) asmvVar6.toBuilder();
                if (h(aihhVar2, map, hashSet)) {
                    aihf builder = asrlVarCD2.toBuilder();
                    builder.copyOnWrite();
                    asrl asrlVar3 = (asrl) builder.instance;
                    asmv asmvVar7 = (asmv) aihhVar2.build();
                    asmvVar7.getClass();
                    asrlVar3.e = asmvVar7;
                    asrlVar3.b |= 4;
                    asrl asrlVar4 = (asrl) builder.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    asrp asrpVar3 = (asrp) aihfVarCreateBuilder.instance;
                    asrlVar4.getClass();
                    asrpVar3.a();
                    asrpVar3.c.set(i3, asrlVar4);
                }
            }
            int size2 = ((asrp) aihfVarCreateBuilder.instance).c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (hashSet.contains(aihfVarCreateBuilder.cD(size2))) {
                    aihfVarCreateBuilder.cF(size2);
                }
            }
        }
        if (!strG.isEmpty()) {
            if (asmvVar != null) {
                aihhVar = (aihh) asmvVar.toBuilder();
                size = ((asrp) aihfVarCreateBuilder.instance).c.size();
                while (true) {
                    size--;
                    if (size > 0) {
                        break;
                    }
                    asrlVarCD = aihfVarCreateBuilder.cD(size);
                    if (asrlVarCD.equals(asrlVar)) {
                        asmvVar4 = asrlVarCD.e;
                        if (asmvVar4 == null) {
                            asmvVar4 = asmv.a;
                        }
                        aihhVar.copyOnWrite();
                        asmv asmvVar8 = (asmv) aihhVar.instance;
                        asmvVar4.getClass();
                        asmvVar8.d();
                        asmvVar8.e.add(0, asmvVar4);
                    }
                    aihfVarCreateBuilder.cF(size);
                }
                if (asrlVar != null) {
                    aihf builder2 = asrlVar.toBuilder();
                    asmvVar2 = asrlVar.e;
                    if (asmvVar2 == null) {
                        asmvVar3 = asmv.a;
                        asmvVar2 = asmv.a;
                    } else {
                        asmvVar3 = asmvVar2;
                    }
                    asmv asmvVar9 = (asmv) n(asmvVar3, (aihh) asmvVar2.toBuilder(), aihhVar).build();
                    builder2.copyOnWrite();
                    asrl asrlVar5 = (asrl) builder2.instance;
                    asmvVar9.getClass();
                    asrlVar5.e = asmvVar9;
                    asrlVar5.b |= 4;
                    aihfVarCreateBuilder.cE((asrl) builder2.build());
                }
            }
            asrpVar = (asrp) aihfVarCreateBuilder.build();
        } else if (((asrp) aihfVarCreateBuilder.instance).c.size() != 0) {
            String string = UUID.randomUUID().toString();
            aihfVarCreateBuilder.copyOnWrite();
            asrp asrpVar4 = (asrp) aihfVarCreateBuilder.instance;
            string.getClass();
            asrpVar4.b |= 1;
            asrpVar4.d = string;
            fjwVar.setTag(R.id.elements_tree_debug_id, string);
            if (asmvVar != null) {
                aihhVar = (aihh) asmvVar.toBuilder();
                size = ((asrp) aihfVarCreateBuilder.instance).c.size();
                while (true) {
                    size--;
                    if (size > 0) {
                        break;
                        break;
                    }
                    asrlVarCD = aihfVarCreateBuilder.cD(size);
                    if (asrlVarCD.equals(asrlVar)) {
                        asmvVar4 = asrlVarCD.e;
                        if (asmvVar4 == null) {
                            asmvVar4 = asmv.a;
                        }
                        aihhVar.copyOnWrite();
                        asmv asmvVar10 = (asmv) aihhVar.instance;
                        asmvVar4.getClass();
                        asmvVar10.d();
                        asmvVar10.e.add(0, asmvVar4);
                    }
                    aihfVarCreateBuilder.cF(size);
                }
                if (asrlVar != null) {
                    aihf builder3 = asrlVar.toBuilder();
                    asmvVar2 = asrlVar.e;
                    if (asmvVar2 == null) {
                        asmvVar3 = asmv.a;
                        asmvVar2 = asmv.a;
                    } else {
                        asmvVar3 = asmvVar2;
                    }
                    asmv asmvVar11 = (asmv) n(asmvVar3, (aihh) asmvVar2.toBuilder(), aihhVar).build();
                    builder3.copyOnWrite();
                    asrl asrlVar6 = (asrl) builder3.instance;
                    asmvVar11.getClass();
                    asrlVar6.e = asmvVar11;
                    asrlVar6.b |= 4;
                    aihfVarCreateBuilder.cE((asrl) builder3.build());
                }
            }
            asrpVar = (asrp) aihfVarCreateBuilder.build();
        }
        if (asrpVar != null) {
            aihfVar.copyOnWrite();
            asrq asrqVar = (asrq) aihfVar.instance;
            asrq asrqVar2 = asrq.a;
            aiie aiieVar2 = asrqVar.c;
            if (!aiieVar2.c()) {
                asrqVar.c = aihn.mutableCopy(aiieVar2);
            }
            asrqVar.c.add(asrpVar);
        }
    }

    private final Set k() {
        List listAsList;
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            View viewPeekDecorView = ((Activity) it.next()).getWindow().peekDecorView();
            if (viewPeekDecorView.hasWindowFocus()) {
                hashSet.add(viewPeekDecorView);
            }
        }
        int i = npi.a;
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object objInvoke = cls.getMethod("getInstance", null).invoke(null, null);
            if (objInvoke == null) {
                listAsList = agpi.a;
            } else {
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj == null) {
                    listAsList = agpi.a;
                } else if (obj instanceof List) {
                    listAsList = (List) obj;
                } else {
                    listAsList = obj instanceof View[] ? Arrays.asList((Object[]) obj) : agpi.a;
                }
            }
        } catch (Exception unused) {
            listAsList = agpi.a;
        }
        for (Object obj2 : listAsList) {
            if (obj2 instanceof View) {
                View view = (View) obj2;
                if (view.getWindowVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (((layoutParams instanceof WindowManager.LayoutParams) && (((WindowManager.LayoutParams) layoutParams).flags & 8) != 0) || view.hasWindowFocus()) {
                        arrayList.add(view);
                    }
                }
            }
        }
        hashSet.addAll(arrayList);
        return hashSet;
    }

    private final void l() {
        synchronized (this.h) {
            Subscription subscription = this.i;
            if (subscription != null) {
                subscription.cancel();
            }
            FaultSubscription faultSubscription = this.j;
            if (faultSubscription != null) {
                faultSubscription.cancel();
            }
        }
    }

    private static boolean m(asmv asmvVar) {
        asow asowVar = asmvVar.c;
        if (asowVar == null) {
            asowVar = asow.a;
        }
        aihl aihlVar = asll.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        asowVar.c(aihlVarCheckIsLite);
        if (asowVar.j.n(aihlVarCheckIsLite.d)) {
            asow asowVar2 = asmvVar.c;
            if (asowVar2 == null) {
                asowVar2 = asow.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            asowVar2.c(aihlVarCheckIsLite2);
            Object objK = asowVar2.j.k(aihlVarCheckIsLite2.d);
            if ((((asll) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c & 32768) != 0) {
                return true;
            }
        }
        return false;
    }

    private static aihh n(asmv asmvVar, aihh aihhVar, aihh aihhVar2) {
        asow asowVar = asmvVar.c;
        if (asowVar == null) {
            asowVar = asow.a;
        }
        aihl aihlVar = asll.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        asowVar.c(aihlVarCheckIsLite);
        if (asowVar.j.n(aihlVarCheckIsLite.d)) {
            asow asowVar2 = asmvVar.c;
            if (asowVar2 == null) {
                asowVar2 = asow.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            asowVar2.c(aihlVarCheckIsLite2);
            Object objK = asowVar2.j.k(aihlVarCheckIsLite2.d);
            if ((((asll) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c & 32768) != 0) {
                return aihhVar2;
            }
        }
        aihhVar.copyOnWrite();
        ((asmv) aihhVar.instance).e = asmv.emptyProtobufList();
        for (asmv asmvVar2 : asmvVar.e) {
            aihh aihhVarN = n(asmvVar2, (aihh) asmvVar2.toBuilder(), aihhVar2);
            aihhVar.copyOnWrite();
            asmv asmvVar3 = (asmv) aihhVar.instance;
            asmv asmvVar4 = (asmv) aihhVarN.build();
            asmvVar4.getClass();
            asmvVar3.d();
            asmvVar3.e.add(asmvVar4);
        }
        return aihhVar;
    }

    @Override // defpackage.nsu
    public final boolean a() {
        return true;
    }

    @Override // defpackage.nsu
    public final boolean b() {
        return this.g.a.get();
    }

    public final View c(String str) {
        Iterator it = k().iterator();
        while (it.hasNext()) {
            View viewJ = npi.j((View) it.next(), str);
            if (viewJ != null) {
                return viewJ;
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void configureLiveUpdating(byte[] bArr) {
        try {
            asrm asrmVar = (asrm) aihn.parseFrom(asrm.a, bArr, ExtensionRegistryLite.a);
            l();
            if (!asrmVar.b) {
                this.g.a();
                return;
            }
            agev agevVar = this.f;
            if (agevVar.g()) {
                synchronized (this.h) {
                    try {
                        this.i = ((ByteStore) agevVar.c()).subscribe(null, this.k);
                        this.j = ((ByteStore) agevVar.c()).subscribeToFaults(this.l);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            npa npaVar = this.g;
            npaVar.d = asrmVar.c;
            if (npaVar.a.getAndSet(true)) {
                return;
            }
            npaVar.e.b.post(new mga(npaVar, 8));
        } catch (aiik e2) {
            Log.w("ElementsDebugger", "Failed to parse ConfigureLiveUpdating message", e2);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void deleteStoreEntry(byte[] bArr) {
        agev agevVar = this.f;
        if (agevVar.g()) {
            try {
                ((ByteStore) agevVar.c()).set(((asrv) aihn.parseFrom(asrv.a, bArr, ExtensionRegistryLite.a)).b, null);
            } catch (aiik e2) {
                Log.w("ElementsDebugger", "Failed to parse UpdateStoreEntry message", e2);
            }
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void disconnected() {
        l();
        this.g.a();
    }

    public final void e(asrx asrxVar) {
        ((DebuggerClient) this.d.io()).sendStoreSnapshot(asrxVar.toByteArray());
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void getStoreSnapshot() {
        Snapshot snapshot;
        agev agevVar = this.f;
        if (!agevVar.g() || (snapshot = ((ByteStore) agevVar.c()).snapshot()) == null) {
            return;
        }
        e((asrx) g(snapshot, snapshot.keys()).build());
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void highlightElements(byte[] bArr) {
        try {
            this.b.post(new msh(this, (asru) aihn.parseFrom(asru.a, bArr, ExtensionRegistryLite.a), 2));
        } catch (aiik e2) {
            Log.w("ElementsDebugger", "Failed to parse PutSelectedElements message", e2);
        }
    }

    public final asrq i() {
        Set setK = k();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Set set = this.a;
        if (!set.isEmpty()) {
            ((Activity) set.iterator().next()).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else if (setK.isEmpty()) {
            displayMetrics = null;
        } else {
            ((View) setK.iterator().next()).getDisplay().getRealMetrics(displayMetrics);
        }
        if (displayMetrics == null) {
            Log.w("ElementsDebugger", "Could not get DisplayMetrics");
            return null;
        }
        aihf aihfVarCreateBuilder = asrq.a.createBuilder();
        aihf aihfVarCreateBuilder2 = asrk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asrk asrkVar = (asrk) aihfVarCreateBuilder2.instance;
        asrkVar.b |= 1;
        asrkVar.c = 0.0f;
        aihfVarCreateBuilder2.copyOnWrite();
        asrk asrkVar2 = (asrk) aihfVarCreateBuilder2.instance;
        asrkVar2.b |= 2;
        asrkVar2.d = 0.0f;
        float f = displayMetrics.widthPixels;
        aihfVarCreateBuilder2.copyOnWrite();
        asrk asrkVar3 = (asrk) aihfVarCreateBuilder2.instance;
        asrkVar3.b |= 4;
        asrkVar3.e = f;
        float f2 = displayMetrics.heightPixels;
        aihfVarCreateBuilder2.copyOnWrite();
        asrk asrkVar4 = (asrk) aihfVarCreateBuilder2.instance;
        asrkVar4.b |= 8;
        asrkVar4.f = f2;
        asrk asrkVar5 = (asrk) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        asrq asrqVar = (asrq) aihfVarCreateBuilder.instance;
        asrkVar5.getClass();
        asrqVar.d = asrkVar5;
        asrqVar.b |= 1;
        Iterator it = setK.iterator();
        while (it.hasNext()) {
            j((View) it.next(), aihfVarCreateBuilder, displayMetrics, (DebuggerClient) this.d.io());
        }
        return (asrq) aihfVarCreateBuilder.build();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.a.add(activity);
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void traverseViewHierarchy() {
        this.b.post(new mga(this, 7));
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void updateComponentModel(byte[] bArr) {
        try {
            this.b.post(new msh(this, (asrh) aihn.parseFrom(asrh.a, bArr, ExtensionRegistryLite.a), 3));
        } catch (aiik e2) {
            Log.w("ElementsDebugger", "Failed to parse UpdateComponentModel message", e2);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void updateStoreEntry(byte[] bArr) {
        agev agevVar = this.f;
        if (agevVar.g()) {
            try {
                asry asryVar = (asry) aihn.parseFrom(asry.a, bArr, ExtensionRegistryLite.a);
                ByteStore byteStore = (ByteStore) agevVar.c();
                String str = asryVar.b;
                aifv aifvVar = asryVar.c;
                if (aifvVar == null) {
                    aifvVar = aifv.a;
                }
                byteStore.set(str, aifvVar.c.G());
            } catch (aiik e2) {
                Log.w("ElementsDebugger", "Failed to parse UpdateStoreEntry message", e2);
            }
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public final void connected() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
