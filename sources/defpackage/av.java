package defpackage;

import app.rive.semantics.SemanticState;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class av extends dn implements cy {
    final dd a;
    boolean b;
    int c;
    boolean d;

    public av(av avVar) {
        avVar.a.j();
        ck ckVar = avVar.a.p;
        if (ckVar != null) {
            ckVar.c.getClassLoader();
        }
        ArrayList arrayList = avVar.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new dm((dm) arrayList.get(i)));
        }
        this.f = avVar.f;
        this.g = avVar.g;
        this.h = avVar.h;
        this.i = avVar.i;
        this.j = avVar.j;
        this.k = avVar.k;
        this.l = avVar.l;
        this.m = avVar.m;
        this.p = avVar.p;
        this.q = avVar.q;
        this.n = avVar.n;
        this.o = avVar.o;
        if (avVar.r != null) {
            this.r = new ArrayList();
            this.r.addAll(avVar.r);
        }
        if (avVar.s != null) {
            this.s = new ArrayList();
            this.s.addAll(avVar.s);
        }
        this.t = avVar.t;
        this.c = -1;
        this.d = false;
        this.a = avVar.a;
        this.b = avVar.b;
        this.c = avVar.c;
        this.d = avVar.d;
    }

    public final int a(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (dd.aa(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new dx());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.b = true;
        if (this.k) {
            this.c = this.a.i.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.J(this, z);
        }
        return this.c;
    }

    public final CharSequence b() {
        int i = this.n;
        return i != 0 ? this.a.p.c.getText(i) : this.o;
    }

    final void c(int i) {
        if (this.k) {
            if (dd.aa(2)) {
                toString();
            }
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dm dmVar = (dm) arrayList.get(i2);
                cc ccVar = dmVar.b;
                if (ccVar != null) {
                    ccVar.mBackStackNesting += i;
                    if (dd.aa(2)) {
                        Objects.toString(dmVar.b);
                        int i3 = dmVar.b.mBackStackNesting;
                    }
                }
            }
        }
    }

    final void d() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            dm dmVar = (dm) arrayList.get(size);
            if (dmVar.c) {
                int i = size - 1;
                if (dmVar.a == 8) {
                    dmVar.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = dmVar.b.mContainerId;
                    dmVar.a = 2;
                    dmVar.c = false;
                    while (i >= 0) {
                        dm dmVar2 = (dm) arrayList.get(i);
                        if (dmVar2.c && dmVar2.b.mContainerId == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.dn
    public final void e() {
        p();
        this.a.K(this, false);
    }

    @Override // defpackage.dn
    public final void f() {
        p();
        this.a.K(this, true);
    }

    @Override // defpackage.dn
    public final void g(int i, cc ccVar, String str, int i2) {
        String str2 = ccVar.mPreviousWho;
        if (str2 != null) {
            bmy.a(ccVar, str2);
        }
        Class<?> cls = ccVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = ccVar.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + ccVar + ": was " + ccVar.mTag + " now " + str);
            }
            ccVar.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + ccVar + " with tag " + str + " to container view with no id");
            }
            int i3 = ccVar.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + ccVar + ": was " + ccVar.mFragmentId + " now " + i);
            }
            ccVar.mFragmentId = i;
            ccVar.mContainerId = i;
        }
        n(new dm(i2, ccVar));
        ccVar.mFragmentManager = this.a;
    }

    public final void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.j));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.h != 0 || this.i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dm dmVar = (dm) arrayList.get(i);
            switch (dmVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + dmVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(dmVar.b);
            if (z) {
                if (dmVar.d != 0 || dmVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(dmVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(dmVar.e));
                }
                if (dmVar.f != 0 || dmVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(dmVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(dmVar.g));
                }
            }
        }
    }

    @Override // defpackage.cy
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        if (dd.aa(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.k) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.dn
    public final boolean j() {
        return this.e.isEmpty();
    }

    @Override // defpackage.dn
    public final void k(cc ccVar) {
        dd ddVar = ccVar.mFragmentManager;
        if (ddVar == null || ddVar == this.a) {
            n(new dm(4, ccVar));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + ccVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.dn
    public final void l(cc ccVar) {
        dd ddVar = ccVar.mFragmentManager;
        if (ddVar == null || ddVar == this.a) {
            n(new dm(3, ccVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + ccVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.dn
    public final void m(cc ccVar) {
        dd ddVar = ccVar.mFragmentManager;
        if (ddVar == null || ddVar == this.a) {
            n(new dm(5, ccVar));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + ccVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.m != null) {
            sb.append(' ');
            sb.append(this.m);
        }
        sb.append('}');
        return sb.toString();
    }

    public av(dd ddVar) {
        ddVar.j();
        ck ckVar = ddVar.p;
        if (ckVar != null) {
            ckVar.c.getClassLoader();
        }
        this.c = -1;
        this.d = false;
        this.a = ddVar;
    }
}
