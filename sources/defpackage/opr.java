package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.ToggleButton;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class opr extends ooo {
    public final View b;
    public final List c;
    private final ops h;
    private final Map i;
    private final Map j;
    private final Map k;
    private final Map l;
    private final Map m;
    private int n;
    private final grj o;

    public opr(Context context, View view, asvc asvcVar, grj grjVar) {
        PaintUnit paintUnitB;
        List listC;
        super(view);
        this.c = new ArrayList();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.n = 1879048192;
        this.b = view;
        this.h = new ops(context);
        this.o = grjVar;
        if (asvcVar == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            asvcVar.aR();
            if (i >= ((ArrayList) asvcVar.d.get()).size()) {
                return;
            }
            asvcVar.aR();
            asut asutVar = (asut) ((ArrayList) asvcVar.d.get()).get(i);
            if (asutVar.bb() != 5) {
                this.c.add(asutVar);
                Map map = this.i;
                Pair pairCreate = Pair.create(asutVar.aX(), asutVar.aY());
                Integer numValueOf = Integer.valueOf(i2);
                map.put(pairCreate, numValueOf);
                if (asutVar.ba() && !asutVar.bc().aS().isEmpty()) {
                    this.j.put(asutVar.bc().aS(), numValueOf);
                }
                m(i2, asutVar);
                i2++;
            }
            if (Memory.peekByte(asutVar.c + 9) != 0 && (paintUnitB = nuj.b(this.b, Integer.parseInt(asutVar.aX()))) != null && (listC = paintUnitB.C(asutVar.bd())) != null) {
                for (int i3 = 0; i3 < listC.size(); i3++) {
                    asut asutVar2 = (asut) listC.get(i3);
                    this.c.add(asutVar2);
                    this.i.put(Pair.create(asutVar2.aX(), asutVar2.aY()), Integer.valueOf(i2));
                    m(i2, asutVar2);
                    i2++;
                }
            }
            if (asutVar.bb() == 4) {
                View view2 = this.b;
                KeyEvent.Callback callbackA = view2 instanceof ViewGroup ? nuj.a((ViewGroup) view2, Integer.parseInt(asutVar.aX())) : null;
                if (callbackA != null) {
                    this.k.put(asutVar.aX(), callbackA);
                    if (callbackA instanceof opt) {
                        opt optVar = (opt) callbackA;
                        asvc asvcVarN = this.o.n(asutVar.aX());
                        if (asvcVarN != null) {
                            optVar.K(asvcVarN, this.o);
                        }
                        optVar.J(asutVar);
                    }
                }
            }
            i++;
        }
    }

    public static final Rect g(mew mewVar) {
        long j = mewVar.c;
        return new Rect(Memory.peekInt(12 + j, false), Memory.peekInt(16 + j, false), Memory.peekInt(20 + j, false), Memory.peekInt(j + 24, false));
    }

    private final void m(int i, asut asutVar) {
        if (asutVar.ba()) {
            asuy asuyVarBc = asutVar.bc();
            if (asuyVarBc.aR() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < asuyVarBc.aR(); i2++) {
                    asuyVarBc.aV();
                    asvj asvjVar = (asvj) ((ArrayList) asuyVarBc.o.get()).get(i2);
                    int i3 = this.n;
                    this.n = i3 + 1;
                    if (asvjVar.e == null) {
                        if ((Memory.peekByte(asvjVar.c + 8) & 1) != 0) {
                            asvjVar.e = asvjVar.cq(asvj.d.b);
                        } else {
                            asvjVar.e = "";
                        }
                    }
                    arrayList.add(new bby(null, i3, asvjVar.e, null, null));
                    this.l.put(Integer.valueOf(i3), new tke(i, Memory.peekInt(asvjVar.c + 12, false)));
                }
                this.m.put(Integer.valueOf(i), arrayList);
            }
        }
    }

    private final boolean n(int i, asut asutVar, long j, boolean z) {
        if (asutVar.aY().isEmpty()) {
            if (z && Memory.peekByte(asutVar.bc().c + 11) != 0) {
                l(i, 4);
            }
            opt optVar = this.a;
            if (optVar != null) {
                return optVar.D(Integer.parseInt(asutVar.aX()), (int) j);
            }
        } else {
            View view = this.b;
            PaintUnit paintUnitB = nuj.b(view, Integer.parseInt(asutVar.aY()));
            if (paintUnitB != null) {
                return paintUnitB.x(Integer.parseInt(asutVar.aX()), j, view);
            }
        }
        return false;
    }

    @Override // defpackage.ooo
    public final int a(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.ooo
    public final boolean b(int i) {
        return k(i, 64, null);
    }

    @Override // defpackage.opv
    protected final void c(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setClassName(this.b.getClass().getName());
        if (accessibilityEvent.getEventType() == 4) {
            List list = this.c;
            if (i >= list.size()) {
                Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Virtual view id is out of bounds for node="));
                return;
            }
            asut asutVar = (asut) list.get(i);
            if (asutVar == null) {
                Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Node info is null for node="));
                return;
            }
            asuy asuyVarBc = asutVar.bc();
            if (Memory.peekByte(asuyVarBc.c + 11) != 0) {
                int iAW = asuyVarBc.aW() - 1;
                if (iAW == 12) {
                    byte bPeekByte = Memory.peekByte(asuyVarBc.c + 12);
                    ops opsVar = this.h;
                    accessibilityEvent.setContentDescription(bPeekByte != 0 ? opsVar.a("not_selected") : opsVar.a("selected"));
                } else if (iAW == 14) {
                    byte bPeekByte2 = Memory.peekByte(asuyVarBc.c + 12);
                    ops opsVar2 = this.h;
                    accessibilityEvent.setContentDescription(bPeekByte2 != 0 ? opsVar2.a("not_checked") : opsVar2.a("checked"));
                } else if (iAW == 15) {
                    byte bPeekByte3 = Memory.peekByte(asuyVarBc.c + 12);
                    ops opsVar3 = this.h;
                    accessibilityEvent.setContentDescription(bPeekByte3 != 0 ? opsVar3.a("capital_off") : opsVar3.a("capital_on"));
                }
            }
        }
    }

    @Override // defpackage.opv
    protected final void d(bbz bbzVar) {
        int i = 0;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                return;
            }
            asut asutVar = (asut) list.get(i);
            if (asutVar.bb() == 4) {
                View view = (View) this.k.get(asutVar.aX());
                if (view != null) {
                    nuk.a(new tld((Object) view, (Object) null, (byte[]) null), this, bbzVar);
                }
            } else if (asutVar.bb() == 2) {
                nuk.a(new tld((Object) null, (Object) Integer.valueOf(i), (byte[]) null), this, bbzVar);
            }
            i++;
        }
    }

    @Override // defpackage.opv
    protected final void e(int i, bbz bbzVar) {
        CharSequence name;
        byte b;
        List list = this.c;
        if (i >= list.size()) {
            Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Virtual view id is out of bounds for node="));
            bbzVar.q(new Rect(0, 0, 1, 1));
            bbzVar.C(false);
            return;
        }
        asut asutVar = (asut) list.get(i);
        if (asutVar == null) {
            bbzVar.q(new Rect(0, 0, 1, 1));
            bbzVar.C(false);
            Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Node info is null for node="));
            return;
        }
        if (asutVar.bb() == 4) {
            bbzVar.q(new Rect(0, 0, 1, 1));
            bbzVar.C(false);
            Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Physical view has no virtual view, node="));
            return;
        }
        mew mewVarBd = asutVar.bd();
        if (mewVarBd == null) {
            bbzVar.q(new Rect(0, 0, 1, 1));
            bbzVar.C(false);
            Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Rect is null for node="));
            return;
        }
        bbzVar.q(g(mewVarBd));
        String strAW = asutVar.aW();
        String strAY = asutVar.aY();
        asuy asuyVarBc = asutVar.bc();
        if (asutVar.aU() > 0) {
            String[] strArr = new String[asutVar.aU()];
            for (int i2 = 0; i2 < asutVar.aU(); i2++) {
                Integer num = (Integer) this.i.get(Pair.create(asutVar.aV(i2), asutVar.aX()));
                if (num == null) {
                    Log.e("ElementsAccessibilityProviderImpl", "Child virtual view id is null for node=" + i + " childKey=" + asutVar.aV(i2));
                } else {
                    bbzVar.l(this.b, num.intValue());
                    strArr[i2] = num.toString();
                }
            }
            bbzVar.a().putStringArray("childKeys", strArr);
        }
        bbzVar.C(asutVar.bb() == 2);
        if (strAW != null && !yno.D(strAW)) {
            bbzVar.z(strAW);
        }
        if (asutVar.bb() != 3 || strAY == null) {
            bbzVar.J(this.b, -1);
        } else {
            Integer num2 = (Integer) this.i.get(Pair.create(strAY, ""));
            if (num2 == null) {
                Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Parent virtual view id is null for node="));
                return;
            }
            bbzVar.J(this.b, num2.intValue());
        }
        if (asuyVarBc != null) {
            int iAW = asuyVarBc.aW() - 1;
            if (iAW == 2) {
                name = Button.class.getName();
            } else if (iAW == 4) {
                name = ImageView.class.getName();
            } else if (iAW == 11) {
                name = Spinner.class.getName();
            } else if (iAW == 12) {
                name = RadioButton.class.getName();
            } else if (iAW != 14) {
                name = iAW != 15 ? null : ToggleButton.class.getName();
            } else {
                name = CompoundButton.class.getName();
            }
            if (name != null) {
                bbzVar.v(name);
            }
            if (asuyVarBc.aW() == 13) {
                byte bPeekByte = Memory.peekByte(asutVar.bc().c + 12);
                ops opsVar = this.h;
                bbzVar.N(bPeekByte != 0 ? opsVar.a("selected") : opsVar.a("not_selected"));
            }
            if (asuyVarBc.aW() == 16) {
                byte bPeekByte2 = Memory.peekByte(asutVar.bc().c + 12);
                ops opsVar2 = this.h;
                bbzVar.N(bPeekByte2 != 0 ? opsVar2.a("capital_on") : opsVar2.a("capital_off"));
            }
            if (!yno.D(asuyVarBc.aT())) {
                bbzVar.P(asuyVarBc.aT());
            }
            String strAU = asuyVarBc.aU();
            if (!strAU.isEmpty()) {
                bbzVar.O(strAU);
            }
            bbzVar.E(Memory.peekByte(asuyVarBc.c + 10) != 0);
            bbzVar.s(Memory.peekByte(asuyVarBc.c + 11) != 0);
            bbzVar.u(Memory.peekByte(asuyVarBc.c + 12) != 0);
            if (Memory.peekByte(asuyVarBc.c + 13) != 0) {
                bbzVar.B(false);
            }
            long jPeekInt = Memory.peekInt(asuyVarBc.c + 20, false);
            if ((2 & jPeekInt) != 0) {
                if (asuyVarBc.m == null) {
                    b = 4;
                    if ((Memory.peekByte(asuyVarBc.c + 9) & 2) != 0) {
                        asuyVarBc.m = asuyVarBc.cq(asuy.h.b);
                    } else {
                        asuyVarBc.m = "";
                    }
                } else {
                    b = 4;
                }
                String str = asuyVarBc.m;
                if (str == null || str.isEmpty()) {
                    bbzVar.j(16);
                } else {
                    bbzVar.k(new bby(null, 16, str, null, null));
                }
                bbzVar.w(true);
            } else {
                b = 4;
            }
            if ((jPeekInt & 4) != 0) {
                if (asuyVarBc.n == null) {
                    if ((Memory.peekByte(asuyVarBc.c + 9) & b) != 0) {
                        asuyVarBc.n = asuyVarBc.cq(asuy.i.b);
                    } else {
                        asuyVarBc.n = "";
                    }
                }
                String str2 = asuyVarBc.n;
                if (str2 == null || str2.isEmpty()) {
                    bbzVar.j(32);
                } else {
                    bbzVar.k(new bby(null, 32, str2, null, null));
                }
                bbzVar.a.setLongClickable(true);
            }
            List list2 = (List) this.m.get(Integer.valueOf(i));
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    bbzVar.k((bby) it.next());
                }
            }
        }
    }

    @Override // defpackage.opv
    protected final boolean f(int i, int i2) {
        boolean z;
        long j;
        List list = this.c;
        if (i >= list.size()) {
            Log.e("ElementsAccessibilityProviderImpl", a.bR(i, "Virtual view id is out of bounds for node="));
            return false;
        }
        asut asutVar = (asut) list.get(i);
        if (asutVar == null) {
            return false;
        }
        tke tkeVar = (tke) this.l.get(Integer.valueOf(i2));
        if (tkeVar != null) {
            if (tkeVar.a == i) {
                return n(i, asutVar, tkeVar.b, false);
            }
            Log.e("ElementsAccessibilityProviderImpl", "Custom action virtualViewId mismatch");
            return false;
        }
        if (i2 == 16) {
            z = true;
            j = 2;
        } else {
            if (i2 != 32) {
                return false;
            }
            j = 4;
            z = false;
        }
        if ((((long) Memory.peekInt(asutVar.bc().c + 20, false)) & j) != 0) {
            return n(i, asutVar, j, z);
        }
        return false;
    }
}
