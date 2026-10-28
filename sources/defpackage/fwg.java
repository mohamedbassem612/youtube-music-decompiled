package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwg extends fvv {
    public static final fwg a = new fwg();

    public static void a(fwf fwfVar) {
        gzj gzjVar = fvp.b;
        boolean zAJ = gzj.aJ();
        if (zAJ) {
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z = fvn.a;
        }
        ArrayList arrayList = new ArrayList();
        Map map = fwfVar.a;
        for (Map.Entry entry : map.entrySet()) {
            fwe fweVar = (fwe) entry.getValue();
            if (fweVar.d) {
                fweVar.d = false;
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            fwe fweVar2 = (fwe) map.get(str);
            if (fweVar2 != null) {
                fve fveVar = fweVar2.b;
                fve fveVar2 = fweVar2.c;
                if (fveVar != null) {
                    kro.bh(fveVar, fwfVar.g);
                }
                if (fweVar2.b()) {
                    fweVar2.a(false);
                    if (fveVar2 != null) {
                        kro.bi(fveVar2);
                    }
                }
                fve fveVar3 = fweVar2.a;
                if (fveVar3 != null) {
                    kro.bj(fveVar3, 0, 0, 0, 0, 0.0f, 0.0f);
                }
                fweVar2.e = false;
            }
            map.remove(str);
        }
        if (zAJ) {
            gzj gzjVar3 = fvp.b;
            boolean z2 = fvn.a;
        }
    }

    public static void c(jnm jnmVar) {
        fwf fwfVar = (fwf) jnmVar.b;
        a(fwfVar);
        fwfVar.b.setEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0182 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:29:0x0080, B:31:0x0086, B:32:0x0088, B:34:0x00a2, B:36:0x00a8, B:38:0x00ac, B:41:0x00b8, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:48:0x00dd, B:53:0x00f1, B:55:0x00ff, B:57:0x0103, B:59:0x010f, B:61:0x011d, B:62:0x0125, B:64:0x012f, B:66:0x0134, B:93:0x01b1, B:95:0x01b7, B:97:0x01bd, B:98:0x01c3, B:100:0x01c9, B:101:0x01cf, B:103:0x01d5, B:104:0x01db, B:106:0x01e1, B:107:0x01e7, B:109:0x01ed, B:111:0x01f1, B:112:0x01f8, B:114:0x0208, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018c, B:86:0x0193, B:77:0x0176, B:87:0x01a0, B:89:0x01a6, B:91:0x01ac, B:116:0x023b, B:117:0x023f, B:49:0x00e2, B:118:0x0252, B:119:0x0260, B:121:0x0266, B:123:0x0281, B:124:0x0289, B:126:0x028f, B:128:0x0297, B:129:0x029d, B:131:0x02a1, B:134:0x02b1, B:133:0x02aa, B:135:0x02b4, B:137:0x02b9), top: B:152:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0188 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:29:0x0080, B:31:0x0086, B:32:0x0088, B:34:0x00a2, B:36:0x00a8, B:38:0x00ac, B:41:0x00b8, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:48:0x00dd, B:53:0x00f1, B:55:0x00ff, B:57:0x0103, B:59:0x010f, B:61:0x011d, B:62:0x0125, B:64:0x012f, B:66:0x0134, B:93:0x01b1, B:95:0x01b7, B:97:0x01bd, B:98:0x01c3, B:100:0x01c9, B:101:0x01cf, B:103:0x01d5, B:104:0x01db, B:106:0x01e1, B:107:0x01e7, B:109:0x01ed, B:111:0x01f1, B:112:0x01f8, B:114:0x0208, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018c, B:86:0x0193, B:77:0x0176, B:87:0x01a0, B:89:0x01a6, B:91:0x01ac, B:116:0x023b, B:117:0x023f, B:49:0x00e2, B:118:0x0252, B:119:0x0260, B:121:0x0266, B:123:0x0281, B:124:0x0289, B:126:0x028f, B:128:0x0297, B:129:0x029d, B:131:0x02a1, B:134:0x02b1, B:133:0x02aa, B:135:0x02b4, B:137:0x02b9), top: B:152:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x018c A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:29:0x0080, B:31:0x0086, B:32:0x0088, B:34:0x00a2, B:36:0x00a8, B:38:0x00ac, B:41:0x00b8, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:48:0x00dd, B:53:0x00f1, B:55:0x00ff, B:57:0x0103, B:59:0x010f, B:61:0x011d, B:62:0x0125, B:64:0x012f, B:66:0x0134, B:93:0x01b1, B:95:0x01b7, B:97:0x01bd, B:98:0x01c3, B:100:0x01c9, B:101:0x01cf, B:103:0x01d5, B:104:0x01db, B:106:0x01e1, B:107:0x01e7, B:109:0x01ed, B:111:0x01f1, B:112:0x01f8, B:114:0x0208, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018c, B:86:0x0193, B:77:0x0176, B:87:0x01a0, B:89:0x01a6, B:91:0x01ac, B:116:0x023b, B:117:0x023f, B:49:0x00e2, B:118:0x0252, B:119:0x0260, B:121:0x0266, B:123:0x0281, B:124:0x0289, B:126:0x028f, B:128:0x0297, B:129:0x029d, B:131:0x02a1, B:134:0x02b1, B:133:0x02aa, B:135:0x02b4, B:137:0x02b9), top: B:152:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:29:0x0080, B:31:0x0086, B:32:0x0088, B:34:0x00a2, B:36:0x00a8, B:38:0x00ac, B:41:0x00b8, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:48:0x00dd, B:53:0x00f1, B:55:0x00ff, B:57:0x0103, B:59:0x010f, B:61:0x011d, B:62:0x0125, B:64:0x012f, B:66:0x0134, B:93:0x01b1, B:95:0x01b7, B:97:0x01bd, B:98:0x01c3, B:100:0x01c9, B:101:0x01cf, B:103:0x01d5, B:104:0x01db, B:106:0x01e1, B:107:0x01e7, B:109:0x01ed, B:111:0x01f1, B:112:0x01f8, B:114:0x0208, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018c, B:86:0x0193, B:77:0x0176, B:87:0x01a0, B:89:0x01a6, B:91:0x01ac, B:116:0x023b, B:117:0x023f, B:49:0x00e2, B:118:0x0252, B:119:0x0260, B:121:0x0266, B:123:0x0281, B:124:0x0289, B:126:0x028f, B:128:0x0297, B:129:0x029d, B:131:0x02a1, B:134:0x02b1, B:133:0x02aa, B:135:0x02b4, B:137:0x02b9), top: B:152:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a6 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:29:0x0080, B:31:0x0086, B:32:0x0088, B:34:0x00a2, B:36:0x00a8, B:38:0x00ac, B:41:0x00b8, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:48:0x00dd, B:53:0x00f1, B:55:0x00ff, B:57:0x0103, B:59:0x010f, B:61:0x011d, B:62:0x0125, B:64:0x012f, B:66:0x0134, B:93:0x01b1, B:95:0x01b7, B:97:0x01bd, B:98:0x01c3, B:100:0x01c9, B:101:0x01cf, B:103:0x01d5, B:104:0x01db, B:106:0x01e1, B:107:0x01e7, B:109:0x01ed, B:111:0x01f1, B:112:0x01f8, B:114:0x0208, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018c, B:86:0x0193, B:77:0x0176, B:87:0x01a0, B:89:0x01a6, B:91:0x01ac, B:116:0x023b, B:117:0x023f, B:49:0x00e2, B:118:0x0252, B:119:0x0260, B:121:0x0266, B:123:0x0281, B:124:0x0289, B:126:0x028f, B:128:0x0297, B:129:0x029d, B:131:0x02a1, B:134:0x02b1, B:133:0x02aa, B:135:0x02b4, B:137:0x02b9), top: B:152:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ac A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:29:0x0080, B:31:0x0086, B:32:0x0088, B:34:0x00a2, B:36:0x00a8, B:38:0x00ac, B:41:0x00b8, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:48:0x00dd, B:53:0x00f1, B:55:0x00ff, B:57:0x0103, B:59:0x010f, B:61:0x011d, B:62:0x0125, B:64:0x012f, B:66:0x0134, B:93:0x01b1, B:95:0x01b7, B:97:0x01bd, B:98:0x01c3, B:100:0x01c9, B:101:0x01cf, B:103:0x01d5, B:104:0x01db, B:106:0x01e1, B:107:0x01e7, B:109:0x01ed, B:111:0x01f1, B:112:0x01f8, B:114:0x0208, B:69:0x0150, B:71:0x0156, B:73:0x015e, B:79:0x017c, B:81:0x0182, B:83:0x0188, B:85:0x018c, B:86:0x0193, B:77:0x0176, B:87:0x01a0, B:89:0x01a6, B:91:0x01ac, B:116:0x023b, B:117:0x023f, B:49:0x00e2, B:118:0x0252, B:119:0x0260, B:121:0x0266, B:123:0x0281, B:124:0x0289, B:126:0x028f, B:128:0x0297, B:129:0x029d, B:131:0x02a1, B:134:0x02b1, B:133:0x02aa, B:135:0x02b4, B:137:0x02b9), top: B:152:0x0080 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void d(jnm jnmVar, Rect rect, boolean z) throws Throwable {
        boolean z2;
        Rect rect2;
        View view;
        Rect rect3 = rect;
        Object obj = jnmVar.b;
        fwf fwfVar = (fwf) obj;
        gzj gzjVar = fvp.b;
        boolean zAJ = gzj.aJ();
        boolean z3 = true;
        if (zAJ) {
            try {
                fvp.a = true;
                gzj gzjVar2 = fvp.b;
                boolean z4 = fvn.a;
            } catch (Throwable th) {
                th = th;
                z2 = zAJ;
                if (z2) {
                    gzj gzjVar3 = fvp.b;
                    boolean z5 = fvn.a;
                }
                throw th;
            }
        }
        Rect rect4 = fwfVar.b;
        if (rect3 == null || (!z && rect4.equals(rect3))) {
            z2 = zAJ;
            rect2 = rect4;
        } else {
            boolean z6 = !rect3.isEmpty();
            int size = fwfVar.c.size();
            gzj gzjVar4 = fvp.b;
            boolean zAJ2 = gzj.aJ();
            Rect rect5 = new Rect();
            int i = 0;
            while (i < size) {
                fwh fwhVar = (fwh) fwfVar.c.get(i);
                String str = fwhVar.b;
                if (zAJ2) {
                    fvp.a = z3;
                    gzj gzjVar5 = fvp.b;
                    boolean z7 = fvn.a;
                }
                Rect rect6 = fwhVar.c;
                boolean intersect = fwc.a ? z6 : rect5.setIntersect(rect6, rect3);
                if (fwc.a) {
                    z3 = z6;
                } else if (!intersect || !rect5.equals(rect6)) {
                    z3 = false;
                }
                String str2 = fwhVar.a;
                Object obj2 = obj;
                Map map = fwfVar.a;
                z2 = zAJ;
                try {
                    fwe fweVar = (fwe) map.get(str2);
                    if (fweVar != null) {
                        fweVar.e = z3;
                    }
                    boolean z8 = z6;
                    fve fveVar = fwhVar.f;
                    int i2 = size;
                    fve fveVar2 = fwhVar.h;
                    boolean z9 = zAJ2;
                    fve fveVar3 = fwhVar.i;
                    int i3 = i;
                    fve fveVar4 = fwhVar.j;
                    fve fveVar5 = fwhVar.g;
                    Rect rect7 = rect4;
                    fve fveVar6 = fwhVar.k;
                    if (fweVar != null) {
                        fweVar.c = fveVar3;
                        fweVar.b = fveVar5;
                        if (intersect) {
                            fveVar4 = fveVar4;
                            fveVar6 = fveVar6;
                            fweVar.d = z;
                        } else {
                            fve fveVar7 = fweVar.b;
                            if (fveVar7 != null) {
                                kro.bh(fveVar7, fwfVar.g);
                            }
                            if (fveVar6 != null) {
                                kro.bj(fveVar6, 0, 0, 0, 0, 0.0f, 0.0f);
                            }
                            if (fweVar.b()) {
                                fweVar.a(false);
                                fve fveVar8 = fweVar.c;
                                if (fveVar8 != null) {
                                    kro.bi(fveVar8);
                                }
                            }
                            map.remove(str2);
                            fweVar = null;
                        }
                    } else {
                        fveVar4 = fveVar4;
                        fveVar6 = fveVar6;
                    }
                    if (intersect) {
                        if (fweVar == null) {
                            fweVar = new fwe(fveVar5, fveVar3, fveVar6);
                            fweVar.d = z;
                            fweVar.e = z3;
                            map.put(str2, fweVar);
                            if (fveVar != null) {
                                Object objA = fwhVar.d ? ((fvg) jnmVar.a).a(fwhVar.e) : null;
                                fvf fvfVarF = jnmVar.F();
                                fvp.a = z3;
                                gzj gzjVar6 = fvp.b;
                                boolean z10 = fvn.a;
                                if (kro.d == null) {
                                    kro.d = new ahfi(null);
                                }
                                ahfi ahfiVar = kro.d;
                                ahfiVar.a = objA;
                                ahfiVar.c = fvfVarF;
                                ahfiVar.b = objA instanceof View ? (View) objA : null;
                                Object[] objArr = new Object[z3];
                                objArr[0] = ahfiVar;
                                fveVar.d(objArr);
                                ahfi ahfiVar2 = kro.d;
                                ahfiVar2.a = null;
                                ahfiVar2.b = null;
                                ahfiVar2.c = null;
                                gzj gzjVar7 = fvp.b;
                            }
                        }
                        if (fveVar2 != null || fveVar3 != null) {
                            fvf fvfVarG = g(jnmVar);
                            if (fvfVarG != null && (view = (View) fvfVarG.getParent()) != null) {
                                int width = (view.getWidth() * view.getHeight()) / 2;
                                int iF = f(rect6);
                                int iF2 = f(rect5);
                                if (iF >= width) {
                                    if (iF2 >= width) {
                                        if (!fweVar.b()) {
                                            fweVar.a(true);
                                            if (fveVar2 != null) {
                                                if (kro.c == null) {
                                                    kro.c = new fhz();
                                                }
                                                fveVar2.d(kro.c);
                                            }
                                        }
                                    } else if (fweVar.b()) {
                                        fweVar.a(false);
                                        if (fveVar3 != null) {
                                            kro.bi(fveVar3);
                                        }
                                    }
                                } else if (rect6.equals(rect5)) {
                                    if (!fweVar.b()) {
                                        fweVar.a(true);
                                        if (fveVar2 != null) {
                                            if (kro.c == null) {
                                                kro.c = new fhz();
                                            }
                                            fveVar2.d(kro.c);
                                        }
                                    }
                                } else if (fweVar.b()) {
                                    fweVar.a(false);
                                    if (fveVar3 != null) {
                                        kro.bi(fveVar3);
                                    }
                                }
                            } else if (fweVar.b()) {
                                fweVar.a(false);
                                if (fveVar3 != null) {
                                    kro.bi(fveVar3);
                                }
                            }
                        }
                        if (fveVar4 != null && !fweVar.c()) {
                            if (rect6.top == rect5.top) {
                                fweVar.f |= 4;
                            }
                            if (rect6.bottom == rect5.bottom) {
                                fweVar.f |= 16;
                            }
                            if (rect6.left == rect5.left) {
                                fweVar.f |= 2;
                            }
                            if (rect6.right == rect5.right) {
                                fweVar.f |= 8;
                            }
                            if (fweVar.c()) {
                                if (kro.b == null) {
                                    kro.b = new fhz();
                                }
                                fveVar4.d(kro.b);
                            }
                        }
                        if (fveVar6 != null) {
                            int iWidth = rect5.width();
                            int iHeight = rect5.height();
                            kro.bj(fveVar6, rect5.top - rect6.top, rect5.left - rect6.left, iWidth, iHeight, (iWidth * 100.0f) / rect6.width(), (iHeight * 100.0f) / rect6.height());
                        }
                    }
                    if (z9) {
                        gzj gzjVar8 = fvp.b;
                        boolean z11 = fvn.a;
                    }
                    i = i3 + 1;
                    rect3 = rect;
                    obj = obj2;
                    z6 = z8;
                    zAJ = z2;
                    size = i2;
                    zAJ2 = z9;
                    rect4 = rect7;
                    z3 = true;
                } catch (Throwable th2) {
                    th = th2;
                    if (z2) {
                        gzj gzjVar9 = fvp.b;
                        boolean z12 = fvn.a;
                    }
                    throw th;
                }
            }
            Object obj3 = obj;
            z2 = zAJ;
            rect2 = rect4;
            Object obj4 = jnmVar.a;
            Iterator it = fwfVar.d.iterator();
            while (it.hasNext()) {
                Object objA2 = ((fvg) obj4).a(((Long) it.next()).longValue());
                fvp.a = true;
                gzj gzjVar10 = fvp.b;
                boolean z13 = fvn.a;
                if (objA2 != null) {
                    Stack stack = new Stack();
                    stack.add(objA2);
                    while (!stack.isEmpty()) {
                        Object objPop = stack.pop();
                        if (objPop instanceof fvo) {
                            ((fvo) objPop).B();
                        } else if (objPop instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) objPop;
                            int childCount = viewGroup.getChildCount();
                            while (true) {
                                childCount--;
                                if (childCount >= 0) {
                                    stack.push(viewGroup.getChildAt(childCount));
                                }
                            }
                        }
                    }
                }
                gzj gzjVar11 = fvp.b;
            }
            if (z) {
                fwf fwfVar2 = (fwf) obj3;
                a(fwfVar2);
                fwfVar2.b.setEmpty();
            }
        }
        if (z2) {
            gzj gzjVar12 = fvp.b;
            boolean z14 = fvn.a;
        }
        if (rect != null) {
            rect2.set(rect);
        }
    }

    public static boolean e(jnm jnmVar) {
        fwd fwdVar = ((fwf) jnmVar.b).f;
        if (fwdVar != null && !((fjc) fwdVar).N) {
            return false;
        }
        fvf fvfVarG = g(jnmVar);
        return fvfVarG == null || !fvfVarG.hasTransientState();
    }

    private static int f(Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.height() * rect.width();
    }

    private static fvf g(jnm jnmVar) {
        fvf fvfVar = ((fwf) jnmVar.b).g;
        return fvfVar == null ? jnmVar.F() : fvfVar;
    }

    @Override // defpackage.fvv
    public final /* synthetic */ Object b() {
        return new fwf();
    }
}
