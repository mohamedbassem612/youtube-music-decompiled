package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.IBinder;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.elements.interfaces.Closure;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mga implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ mga(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, nzw] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, nzw] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Dialog dialog;
        Window window;
        InputMethodManager inputMethodManager;
        nzk nzkVarAk;
        int iG;
        agke agkeVarN;
        aihf aihfVarMo53clone;
        agke agkeVarN2;
        int i;
        String string;
        int i2 = 8;
        int i3 = 2;
        View currentFocus = null;
        currentFocus = null;
        char c = 1;
        switch (this.$cid) {
            case 0:
                Object obj = ((mgc) this.a).a;
                if (obj != null) {
                    Activity activity = (Activity) obj;
                    View currentFocus2 = activity.getCurrentFocus();
                    if (currentFocus2 != null) {
                        currentFocus = currentFocus2;
                    } else if (obj instanceof cf) {
                        for (cc ccVar : ((cf) obj).getSupportFragmentManager().k()) {
                            if ((ccVar instanceof bp) && (dialog = ((bp) ccVar).f) != null && (window = dialog.getWindow()) != null && window.getCurrentFocus() != null) {
                                currentFocus = window.getCurrentFocus();
                            }
                        }
                    }
                    if (currentFocus == null) {
                        mgc.e(activity.getWindow().getDecorView());
                        return;
                    } else {
                        mgc.e(currentFocus);
                        currentFocus.clearFocus();
                        return;
                    }
                }
                return;
            case 1:
                ((mfu) this.a).a(null);
                return;
            case 2:
                Object obj2 = this.a;
                mji mjiVar = (mji) obj2;
                if (!mjiVar.requestFocus() || (inputMethodManager = (InputMethodManager) mjiVar.getContext().getSystemService("input_method")) == null) {
                    return;
                }
                inputMethodManager.showSoftInput((View) obj2, 1);
                return;
            case 3:
                mji mjiVar2 = (mji) this.a;
                mjiVar2.clearFocus();
                InputMethodManager inputMethodManager2 = (InputMethodManager) mjiVar2.getContext().getSystemService("input_method");
                IBinder windowToken = mjiVar2.getWindowToken();
                if (inputMethodManager2 == null || windowToken == null) {
                    return;
                }
                inputMethodManager2.hideSoftInputFromWindow(windowToken, 0);
                return;
            case 4:
                orx orxVar = (orx) this.a;
                View view = orxVar.a;
                if (view != null) {
                    mej.d(view);
                    orxVar.c();
                    return;
                }
                return;
            case 5:
                ((awkq) this.a).dispose();
                return;
            case 6:
                ((avmm) this.a).dispose();
                return;
            case 7:
                npb npbVar = (npb) this.a;
                asrq asrqVarI = npbVar.i();
                if (asrqVarI != null) {
                    ((DebuggerClient) npbVar.d.io()).traverseViewHierarchyResponse(asrqVarI.toByteArray());
                    return;
                }
                return;
            case 8:
                Object obj3 = this.a;
                npa npaVar = (npa) obj3;
                npb npbVar2 = npaVar.e;
                asrq asrqVarI2 = npbVar2.i();
                byte[] byteArray = asrqVarI2 != null ? asrqVarI2.toByteArray() : null;
                if (byteArray != null) {
                    if (Arrays.equals(byteArray, npaVar.b)) {
                        int i4 = npaVar.c + 1;
                        npaVar.c = i4;
                        if (npaVar.d && i4 > 1) {
                            final tld tldVar = npaVar.f;
                            HashMap map = new HashMap();
                            Iterator it = npbVar2.a.iterator();
                            while (it.hasNext()) {
                                Window window2 = ((Activity) it.next()).getWindow();
                                View viewPeekDecorView = window2.peekDecorView();
                                if (viewPeekDecorView.hasWindowFocus()) {
                                    map.put(window2, viewPeekDecorView);
                                }
                            }
                            for (Map.Entry entry : map.entrySet()) {
                                Window window3 = (Window) entry.getKey();
                                View view2 = (View) entry.getValue();
                                final ArrayList arrayList = new ArrayList();
                                npb.f(view2, arrayList);
                                if (!arrayList.isEmpty()) {
                                    final DebuggerClient debuggerClient = (DebuggerClient) npbVar2.d.io();
                                    View rootView = window3.getDecorView().getRootView();
                                    int[] iArr = new int[i3];
                                    rootView.getLocationInWindow(iArr);
                                    int i5 = iArr[0];
                                    char c2 = c;
                                    final Rect rect = new Rect(i5, iArr[c], i5 + rootView.getWidth(), iArr[c2] + rootView.getHeight());
                                    final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                                    try {
                                        PixelCopy.request(window3, bitmapCreateBitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: npj
                                            /* JADX WARN: Code duplicated, block: B:112:0x01d5 A[SYNTHETIC] */
                                            /* JADX WARN: Code duplicated, block: B:36:0x010d  */
                                            /* JADX WARN: Code duplicated, block: B:38:0x0111  */
                                            /* JADX WARN: Code duplicated, block: B:70:0x0179 A[PHI: r9
                                              0x0179: PHI (r9v17 android.graphics.Bitmap) = (r9v16 android.graphics.Bitmap), (r9v18 android.graphics.Bitmap) binds: [B:59:0x0167, B:69:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:71:0x017c  */
                                            /* JADX WARN: Code duplicated, block: B:73:0x017f  */
                                            /* JADX WARN: Code duplicated, block: B:75:0x01c3  */
                                            public final void onPixelCopyFinished(int i6) throws Throwable {
                                                assj assjVar;
                                                tld tldVar2;
                                                byte[] byteArray2;
                                                assj assjVar2;
                                                aiie aiieVar;
                                                int iRound;
                                                RuntimeException e;
                                                Bitmap bitmapCreateScaledBitmap;
                                                Bitmap bitmap;
                                                Bitmap bitmap2 = bitmapCreateBitmap;
                                                if (i6 == 0) {
                                                    List list = arrayList;
                                                    HashMap map2 = new HashMap();
                                                    Iterator it2 = list.iterator();
                                                    while (true) {
                                                        assjVar = null;
                                                        bitmapCreateBitmap = null;
                                                        bitmapCreateBitmap = null;
                                                        Bitmap bitmapCreateBitmap2 = null;
                                                        bitmap = null;
                                                        assjVar = null;
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        View view3 = (View) it2.next();
                                                        if (view3.getWidth() > 0 && view3.getHeight() > 0) {
                                                            int[] iArr2 = new int[2];
                                                            view3.getLocationInWindow(iArr2);
                                                            String strG = npi.g(view3);
                                                            if (strG != null) {
                                                                Rect rect2 = rect;
                                                                int i7 = iArr2[0];
                                                                Rect rect3 = new Rect(i7, iArr2[1], view3.getWidth() + i7, iArr2[1] + view3.getHeight());
                                                                if (rect2.contains(rect3)) {
                                                                    bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, rect3.left - rect2.left, rect3.top - rect2.top, rect3.width(), rect3.height());
                                                                } else if (Rect.intersects(rect2, rect3)) {
                                                                    Rect rect4 = new Rect();
                                                                    if (rect4.setIntersect(rect2, rect3) && !rect4.isEmpty()) {
                                                                        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(rect3.width(), rect3.height(), Bitmap.Config.ARGB_8888);
                                                                        new Canvas(bitmapCreateBitmap3).drawBitmap(Bitmap.createBitmap(bitmap2, rect4.left - rect2.left, rect4.top - rect2.top, rect4.width(), rect4.height()), rect4.left - rect3.left, rect4.top - rect3.top, (Paint) null);
                                                                        bitmapCreateBitmap2 = bitmapCreateBitmap3;
                                                                    }
                                                                }
                                                                if (bitmapCreateBitmap2 != null) {
                                                                    map2.put(strG, bitmapCreateBitmap2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (!map2.isEmpty()) {
                                                        if (!map2.isEmpty()) {
                                                            aihf aihfVarCreateBuilder = assj.a.createBuilder();
                                                            Iterator it3 = map2.entrySet().iterator();
                                                            while (true) {
                                                                tldVar2 = tldVar;
                                                                if (!it3.hasNext()) {
                                                                    break;
                                                                }
                                                                Map.Entry entry2 = (Map.Entry) it3.next();
                                                                String str = (String) entry2.getKey();
                                                                Bitmap bitmap3 = (Bitmap) entry2.getValue();
                                                                HashMap map3 = (HashMap) tldVar2.b;
                                                                if (map3.containsKey(str)) {
                                                                    Bitmap bitmap4 = (Bitmap) map3.get(str);
                                                                    int i8 = npi.a;
                                                                    if (!bitmap4.sameAs(bitmap3)) {
                                                                        int i9 = npi.a;
                                                                        if (bitmap3 != null) {
                                                                            iRound = Math.round(bitmap3.getWidth() * 0.5f);
                                                                            int iRound2 = Math.round(bitmap3.getHeight() * 0.5f);
                                                                            if (iRound > 0 || iRound2 <= 0) {
                                                                                byteArray2 = null;
                                                                            } else {
                                                                                try {
                                                                                    bitmapCreateScaledBitmap = (iRound == bitmap3.getWidth() && iRound2 == bitmap3.getHeight()) ? bitmap3 : Bitmap.createScaledBitmap(bitmap3, iRound, iRound2, true);
                                                                                    try {
                                                                                        try {
                                                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                                                            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                                                                            byteArray2 = byteArrayOutputStream.toByteArray();
                                                                                            byteArrayOutputStream.flush();
                                                                                            byteArrayOutputStream.close();
                                                                                            if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmap3) {
                                                                                                bitmapCreateScaledBitmap.recycle();
                                                                                            }
                                                                                        } catch (Throwable th) {
                                                                                            th = th;
                                                                                            bitmap = bitmapCreateScaledBitmap;
                                                                                            if (bitmap != null && bitmap != bitmap3) {
                                                                                                bitmap.recycle();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (IOException unused) {
                                                                                        if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmap3) {
                                                                                            bitmapCreateScaledBitmap.recycle();
                                                                                        }
                                                                                        byteArray2 = null;
                                                                                    } catch (RuntimeException e2) {
                                                                                        e = e2;
                                                                                        e.getMessage();
                                                                                        if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmap3) {
                                                                                            bitmapCreateScaledBitmap.recycle();
                                                                                        }
                                                                                        byteArray2 = null;
                                                                                    }
                                                                                } catch (IOException unused2) {
                                                                                    bitmapCreateScaledBitmap = null;
                                                                                } catch (RuntimeException e3) {
                                                                                    e = e3;
                                                                                    bitmapCreateScaledBitmap = null;
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            byteArray2 = null;
                                                                        }
                                                                        if (byteArray2 != null) {
                                                                            aihf aihfVarCreateBuilder2 = assi.a.createBuilder();
                                                                            aihfVarCreateBuilder2.copyOnWrite();
                                                                            assi assiVar = (assi) aihfVarCreateBuilder2.instance;
                                                                            str.getClass();
                                                                            assiVar.b |= 2;
                                                                            assiVar.d = str;
                                                                            aigj aigjVarV = aigj.v(byteArray2);
                                                                            aihfVarCreateBuilder2.copyOnWrite();
                                                                            assi assiVar2 = (assi) aihfVarCreateBuilder2.instance;
                                                                            aigjVarV.getClass();
                                                                            assiVar2.b |= 1;
                                                                            assiVar2.c = aigjVarV;
                                                                            assi assiVar3 = (assi) aihfVarCreateBuilder2.build();
                                                                            aihfVarCreateBuilder.copyOnWrite();
                                                                            assjVar2 = (assj) aihfVarCreateBuilder.instance;
                                                                            assiVar3.getClass();
                                                                            aiieVar = assjVar2.b;
                                                                            if (!aiieVar.c()) {
                                                                                assjVar2.b = aihn.mutableCopy(aiieVar);
                                                                            }
                                                                            assjVar2.b.add(assiVar3);
                                                                            ((HashMap) tldVar2.b).put(str, bitmap3);
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i10 = npi.a;
                                                                    if (bitmap3 != null) {
                                                                        iRound = Math.round(bitmap3.getWidth() * 0.5f);
                                                                        int iRound3 = Math.round(bitmap3.getHeight() * 0.5f);
                                                                        if (iRound > 0) {
                                                                            byteArray2 = null;
                                                                        } else {
                                                                            byteArray2 = null;
                                                                        }
                                                                    } else {
                                                                        byteArray2 = null;
                                                                    }
                                                                    if (byteArray2 != null) {
                                                                        aihf aihfVarCreateBuilder3 = assi.a.createBuilder();
                                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                                        assi assiVar4 = (assi) aihfVarCreateBuilder3.instance;
                                                                        str.getClass();
                                                                        assiVar4.b |= 2;
                                                                        assiVar4.d = str;
                                                                        aigj aigjVarV2 = aigj.v(byteArray2);
                                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                                        assi assiVar5 = (assi) aihfVarCreateBuilder3.instance;
                                                                        aigjVarV2.getClass();
                                                                        assiVar5.b |= 1;
                                                                        assiVar5.c = aigjVarV2;
                                                                        assi assiVar6 = (assi) aihfVarCreateBuilder3.build();
                                                                        aihfVarCreateBuilder.copyOnWrite();
                                                                        assjVar2 = (assj) aihfVarCreateBuilder.instance;
                                                                        assiVar6.getClass();
                                                                        aiieVar = assjVar2.b;
                                                                        if (!aiieVar.c()) {
                                                                            assjVar2.b = aihn.mutableCopy(aiieVar);
                                                                        }
                                                                        assjVar2.b.add(assiVar6);
                                                                        ((HashMap) tldVar2.b).put(str, bitmap3);
                                                                    }
                                                                }
                                                                ArrayList arrayList2 = (ArrayList) tldVar2.a;
                                                                arrayList2.remove(str);
                                                                arrayList2.add(str);
                                                            }
                                                            if (((assj) aihfVarCreateBuilder.instance).b.size() != 0) {
                                                                while (true) {
                                                                    ArrayList arrayList3 = (ArrayList) tldVar2.a;
                                                                    if (arrayList3.size() <= 64) {
                                                                        break;
                                                                    }
                                                                    String str2 = (String) arrayList3.get(0);
                                                                    HashMap map4 = (HashMap) tldVar2.b;
                                                                    Bitmap bitmap5 = (Bitmap) map4.get(str2);
                                                                    if (bitmap5 != null) {
                                                                        bitmap5.recycle();
                                                                    }
                                                                    map4.remove(str2);
                                                                    arrayList3.remove(0);
                                                                }
                                                                assjVar = (assj) aihfVarCreateBuilder.build();
                                                            }
                                                        }
                                                        if (assjVar != null && debuggerClient.sendViewSnapshotList(assjVar.toByteArray())) {
                                                            assjVar.b.size();
                                                        }
                                                    }
                                                }
                                                bitmap2.recycle();
                                            }
                                        }, new Handler());
                                    } catch (RuntimeException e) {
                                        e.getMessage();
                                    }
                                    c = c2;
                                    i3 = 2;
                                    break;
                                }
                            }
                            npaVar.c = 0;
                        }
                    } else {
                        ((DebuggerClient) npbVar2.d.io()).traverseViewHierarchyResponse(byteArray);
                        npaVar.b = byteArray;
                        npaVar.c = 0;
                    }
                }
                if (npaVar.a.get()) {
                    npaVar.e.b.postDelayed(new mga(obj3, i2), 140L);
                    return;
                }
                return;
            case 9:
                ((Closure) this.a).run();
                return;
            case 10:
                nza nzaVar = (nza) this.a;
                if (nzaVar.d) {
                    return;
                }
                nzs nzsVar = (nzs) nza.b.get(nzaVar.c);
                String str = nzsVar == null ? nzs.UNKNOWN.x : nzsVar.x;
                if (nzsVar != null || nzaVar.k == null) {
                    nzaVar.g(str, nzaVar.e, nzaVar.f);
                }
                long j = nzaVar.i;
                if (j > 0) {
                    long j2 = nzaVar.j;
                    if (j2 > 0) {
                        nzaVar.g(nzs.FIRST_ROOT_MATERIALIZATION.x, j, j2);
                    }
                }
                long j3 = nzaVar.g;
                if (j3 > 0) {
                    long j4 = nzaVar.h;
                    if (j4 > 0) {
                        nzaVar.g(nzs.FIRST_ROOT_MEASUREMENT.x, j3, j4);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                Object obj4 = this.a;
                nzq nzqVarA = nzr.a();
                nzc nzcVar = (nzc) obj4;
                nzqVarA.d = Integer.valueOf(nzcVar.b);
                nzqVarA.c(agpr.a);
                nzk nzkVar = nzcVar.f;
                if (nzkVar != null) {
                    nzqVarA.l = Integer.valueOf(nzkVar.b);
                    nzqVarA.m = nzkVar.c;
                }
                Iterator it2 = nzcVar.d.a(nzs.COMMAND_EXECUTION.x, nzqVarA).iterator();
                while (it2.hasNext()) {
                    nzcVar.c.g(nzcVar.e, ((nzp) it2.next()).a());
                }
                return;
            case 12:
                Collection collection = ahxh.b;
                ArrayList arrayList2 = new ArrayList(ahxh.c);
                ArrayList arrayList3 = new ArrayList(ahxh.b);
                Object obj5 = this.a;
                nzs nzsVar2 = nzs.NATIVE_LIBRARY_CHECK;
                sdo sdoVar = (sdo) obj5;
                adam adamVar = (adam) sdoVar.b;
                if (adamVar.a(nzsVar2)) {
                    for (nzp nzpVar : sdo.m(arrayList2)) {
                        nzpVar.b(nzsVar2.x);
                        sdoVar.d.g((String) sdoVar.a, nzpVar.a());
                    }
                }
                nzs nzsVar3 = nzs.NATIVE_LIBRARY_LOAD;
                if (adamVar.a(nzsVar3)) {
                    for (nzp nzpVar2 : sdo.m(arrayList3)) {
                        nzpVar2.b(nzsVar3.x);
                        sdoVar.d.g((String) sdoVar.a, nzpVar2.a());
                    }
                    return;
                }
                return;
            case 13:
                nzm nzmVar = (nzm) this.a;
                nzmVar.a(nzmVar.a.flushPerformanceSpans());
                return;
            case 14:
                nzn nznVar = (nzn) this.a;
                Boolean bool = (Boolean) nznVar.m.get();
                nznVar.g.a((String) nznVar.l.get(), bool != null ? bool.booleanValue() : false);
                return;
            case 15:
                Object obj6 = this.a;
                nzn nznVar2 = (nzn) obj6;
                if (nznVar2.i) {
                    ci ciVar = nznVar2.o;
                    if (ciVar == null) {
                        return;
                    }
                    nzkVarAk = ciVar.ak();
                    if (!nzkVarAk.a) {
                        return;
                    }
                } else {
                    nzkVarAk = null;
                    c = 0;
                }
                String str2 = (String) nznVar2.l.get();
                nzq nzqVarA2 = nzr.a();
                nzqVarA2.c(str2 == null ? agpr.a : new agqj(str2));
                if (nzkVarAk != null) {
                    nzqVarA2.l = Integer.valueOf(nzkVarAk.b);
                    nzqVarA2.m = nzkVarAk.c;
                }
                if (c != 0 || nznVar2.n.a(nzs.COMPONENT_MATERIALIZATION)) {
                    List listA = nznVar2.c.a(nzs.COMPONENT_MATERIALIZATION.x, nzqVarA2);
                    if (listA.isEmpty()) {
                        return;
                    }
                    ((nzp) listA.get(0)).d = Integer.valueOf(nznVar2.f);
                    iG = nznVar2.k.g(nznVar2.h, ((nzp) listA.get(0)).a());
                } else {
                    iG = -1;
                }
                if (c != 0 || nznVar2.n.a(nzs.TEMPLATE_FETCHING)) {
                    nznVar2.i(nznVar2.d.a(nzs.TEMPLATE_FETCHING.x, nzqVarA2), iG);
                }
                if (c != 0 || nznVar2.n.a(nzs.TEMPLATE_RESOLUTION)) {
                    nznVar2.i(nznVar2.e.a(nzs.TEMPLATE_RESOLUTION.x, nzqVarA2), iG);
                }
                if (c != 0 || nznVar2.n.a(nzs.PB_TO_FB)) {
                    synchronized (nznVar2.b) {
                        List list = ((nzn) obj6).j;
                        agkeVarN = !list.isEmpty() ? agke.n(list) : null;
                        break;
                    }
                    if (agkeVarN != null) {
                        ArrayList arrayList4 = new ArrayList(agkeVarN.size());
                        int size = agkeVarN.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            axmq axmqVar = (axmq) agkeVarN.get(i6);
                            nzp nzpVar3 = new nzp();
                            nzpVar3.b(nzs.PB_TO_FB.x);
                            long j5 = axmqVar.a;
                            nzpVar3.c = 0L;
                            Object obj7 = axmqVar.b;
                            nzqVarA2.b = null;
                            nzpVar3.e = nzqVarA2.a();
                            arrayList4.add(nzpVar3);
                        }
                        nznVar2.i(arrayList4, iG);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((HttpURLConnection) this.a).disconnect();
                return;
            case 17:
                Object obj8 = this.a;
                obn obnVar = (obn) obj8;
                synchronized (obnVar.h) {
                    aihfVarMo53clone = ((obn) obj8).m.mo53clone();
                    break;
                }
                synchronized (obnVar.i) {
                    List list2 = ((obn) obj8).j;
                    agkeVarN2 = agke.n(list2);
                    list2.clear();
                    ((obn) obj8).k = false;
                    break;
                }
                int size2 = agkeVarN2.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size2) {
                    obm obmVar = (obm) agkeVarN2.get(i8);
                    if (i7 >= obnVar.c) {
                        obnVar.d((fxa) aihfVarMo53clone.build());
                        aihfVarMo53clone.copyOnWrite();
                        fxa fxaVar = (fxa) aihfVarMo53clone.instance;
                        fxa fxaVar2 = fxa.a;
                        fxaVar.c = fxa.emptyProtobufList();
                        i = 0;
                    } else {
                        i = i7;
                    }
                    aihf aihfVarCreateBuilder = fxe.a.createBuilder();
                    long j6 = obmVar.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    fxe fxeVar = (fxe) aihfVarCreateBuilder.instance;
                    fxeVar.b |= 1;
                    fxeVar.c = j6;
                    long j7 = obmVar.b;
                    aihfVarCreateBuilder.copyOnWrite();
                    fxe fxeVar2 = (fxe) aihfVarCreateBuilder.instance;
                    fxeVar2.b |= 2;
                    fxeVar2.d = j7;
                    long j8 = obmVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    fxe fxeVar3 = (fxe) aihfVarCreateBuilder.instance;
                    fxeVar3.b |= 32;
                    fxeVar3.h = j8;
                    String str3 = obmVar.d;
                    if (str3 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        fxe fxeVar4 = (fxe) aihfVarCreateBuilder.instance;
                        fxeVar4.b |= 64;
                        fxeVar4.i = str3;
                    }
                    Throwable th = obmVar.c;
                    int i9 = th == null ? 2 : 3;
                    aihfVarCreateBuilder.copyOnWrite();
                    fxe fxeVar5 = (fxe) aihfVarCreateBuilder.instance;
                    fxeVar5.e = i9 - 1;
                    fxeVar5.b |= 4;
                    if (th != null) {
                        String name = th.getClass().getName();
                        aihfVarCreateBuilder.copyOnWrite();
                        fxe fxeVar6 = (fxe) aihfVarCreateBuilder.instance;
                        name.getClass();
                        fxeVar6.b |= 8;
                        fxeVar6.f = name;
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                try {
                                    th.printStackTrace(printWriter);
                                    string = stringWriter.toString();
                                    printWriter.close();
                                    stringWriter.close();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    fxe fxeVar7 = (fxe) aihfVarCreateBuilder.instance;
                                    string.getClass();
                                    fxeVar7.b |= 16;
                                    fxeVar7.g = string;
                                } catch (Throwable th2) {
                                    try {
                                        printWriter.close();
                                        break;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                try {
                                    stringWriter.close();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        } catch (IOException unused) {
                            string = "";
                        }
                    }
                    fxe fxeVar8 = (fxe) aihfVarCreateBuilder.build();
                    aihfVarMo53clone.copyOnWrite();
                    fxa fxaVar3 = (fxa) aihfVarMo53clone.instance;
                    fxa fxaVar4 = fxa.a;
                    fxeVar8.getClass();
                    aiie aiieVar = fxaVar3.c;
                    if (!aiieVar.c()) {
                        fxaVar3.c = aihn.mutableCopy(aiieVar);
                    }
                    fxaVar3.c.add(fxeVar8);
                    i8++;
                    i7 = i + 1;
                }
                if (i7 > 0) {
                    obnVar.d((fxa) aihfVarMo53clone.build());
                    aihfVarMo53clone.copyOnWrite();
                    fxa fxaVar5 = (fxa) aihfVarMo53clone.instance;
                    fxa fxaVar6 = fxa.a;
                    fxaVar5.c = fxa.emptyProtobufList();
                    return;
                }
                return;
            case 18:
                odr odrVar = (odr) this.a;
                odx odxVar = (odx) odrVar.a.io();
                long j9 = odrVar.d;
                if (j9 > 0) {
                    odxVar.a.b(new mga(odxVar, 19), j9);
                    return;
                } else {
                    odxVar.a();
                    return;
                }
            case 19:
                ((odx) this.a).a();
                return;
            default:
                ohj ohjVar = (ohj) this.a;
                ohjVar.b();
                ohjVar.d = 0.0f;
                ohjVar.c = (ohjVar.c + 216.0f) % 360.0f;
                ohjVar.d();
                int[] iArr2 = ohjVar.f;
                int i10 = iArr2[0];
                ohjVar.e = i10;
                ohjVar.d();
                ohjVar.b.setIntValues(i10, iArr2[0]);
                return;
        }
    }
}
