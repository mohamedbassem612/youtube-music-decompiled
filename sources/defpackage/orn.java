package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface;
import com.google.android.libraries.multiplatform.elements.uibuilder.DimensionUnitConverter;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class orn implements opj {
    private final /* synthetic */ int $cid;

    public orn(int i) {
        this.$cid = i;
    }

    public static final void c(View view, atbf atbfVar, orq orqVar) {
        RecyclerView recyclerView;
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                recyclerView = null;
                break;
            } else {
                if (parent instanceof RecyclerView) {
                    recyclerView = (RecyclerView) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        if (recyclerView != null) {
            Object tag = recyclerView.getTag(R.id.elements_item_touch_helper);
            if (tag instanceof pv) {
                pv pvVar = (pv) tag;
                oh ohVarH = recyclerView.h(view);
                if (ohVarH != null) {
                    if (atbfVar.f == null && (Memory.peekByte(atbfVar.c + 8) & 4) == 0) {
                        ohVarH.a.setTag(R.id.elements_item_drag_started_sender_state_consumer, null);
                    } else {
                        ohVarH.a.setTag(R.id.elements_item_drag_started_sender_state_consumer, new hrr(recyclerView, orqVar, atbfVar, 5));
                    }
                    if (atbfVar.e == null && (Memory.peekByte(atbfVar.c + 8) & 2) == 0) {
                        ohVarH.a.setTag(R.id.elements_item_dropped_sender_state_consumer, null);
                    } else {
                        ohVarH.a.setTag(R.id.elements_item_dropped_sender_state_consumer, new hrr(recyclerView, orqVar, atbfVar, 6));
                    }
                    pvVar.v(ohVarH);
                }
            }
        }
    }

    @Override // defpackage.opj
    public final mep a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? atgq.d : atbf.d;
        }
        return atcw.d;
    }

    @Override // defpackage.opj
    public final /* synthetic */ void b(met metVar, NodeViewInterface nodeViewInterface, ElementsServices elementsServices, oph ophVar) {
        char c;
        char c2;
        int i;
        osv osvVar;
        Editable text;
        NodeViewInterface nodeViewInterface2 = nodeViewInterface;
        int i2 = this.$cid;
        int i3 = 3;
        boolean z = false;
        if (i2 == 0) {
            atcw atcwVar = (atcw) metVar;
            long jG = nodeViewInterface2.g();
            if ((jG & 2) != 0) {
                nodeViewInterface2.setClickable(true);
            }
            if ((jG & 4) != 0) {
                nodeViewInterface2.setLongClickable(true);
            }
            if (jG != 0) {
                orq orqVarL = elementsServices.l();
                int i4 = orp.g;
                if ((jG & 532497286) == 0 || !(nodeViewInterface2 instanceof osw)) {
                    c = 1;
                    c2 = 0;
                } else {
                    c = 1;
                    c2 = 0;
                    final orp orpVar = new orp((osw) nodeViewInterface, nodeViewInterface, jG, atcwVar, orqVarL, elementsServices, ophVar);
                    nodeViewInterface2 = nodeViewInterface;
                    int i5 = oro.e;
                    if ((jG & 498942852) != 0) {
                        oro oroVar = new oro(jG, orpVar, (jG & 2621440) != 0 ? new ScaleGestureDetector(elementsServices.c(), orpVar) : null, (jG & 9437184) != 0 ? new otd(elementsServices.c(), orpVar, elementsServices.a()) : null);
                        orpVar = orpVar;
                        ((NodeViewInternalInterface) nodeViewInterface2).Z(oroVar);
                    } else {
                        ((NodeViewInternalInterface) nodeViewInterface2).aa(orpVar);
                    }
                    if ((jG & 33554432) != 0) {
                        nodeViewInterface2.setOnContextClickListener(new View.OnContextClickListener() { // from class: orm
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.view.View.OnContextClickListener
                            public final boolean onContextClick(View view) {
                                int iA;
                                int iD;
                                NodeTreeProcessor nodeTreeProcessorM;
                                orp orpVar2 = orpVar;
                                if ((orpVar2.b & 33554432) == 0) {
                                    return false;
                                }
                                orq orqVar = orpVar2.d;
                                atcw atcwVar2 = orpVar2.c;
                                if (atcwVar2.i == null && (Memory.peekByte(atcwVar2.c + 10) & 64) != 0) {
                                    atcwVar2.i = new mew(atcwVar2.cp(true != atcy.a ? 100 : 192, atcm.a));
                                }
                                mew mewVar = atcwVar2.i == null ? atcl.a : atcwVar2.i;
                                boolean z2 = view instanceof NodeViewInterface;
                                if (z2) {
                                    NodeViewInterface nodeViewInterface3 = (NodeViewInterface) view;
                                    iD = nodeViewInterface3.d();
                                    iA = nodeViewInterface3.b();
                                } else if (view instanceof ooy) {
                                    ooy ooyVar = (ooy) view;
                                    int iD2 = ooyVar.d();
                                    if (!z2 || (nodeTreeProcessorM = ((NodeViewInterface) view).m()) == null) {
                                        NodeTreeProcessor nodeTreeProcessorH = ooyVar.h();
                                        iA = nodeTreeProcessorH != null ? nodeTreeProcessorH.a(iD2) : -1;
                                    } else {
                                        iA = nodeTreeProcessorM.a(iD2);
                                    }
                                    iD = iD2;
                                } else {
                                    iA = -1;
                                    iD = -1;
                                }
                                orr orrVarA = orp.a(orpVar2.e, orpVar2.f);
                                orrVarA.e(view);
                                orrVarA.d(iD);
                                orrVarA.c(iA);
                                orqVar.d(mewVar, orrVarA.a());
                                return true;
                            }
                        });
                        nodeViewInterface2.setContextClickable(true);
                    }
                    if ((jG & 16777216) != 0 && (atcwVar.e != null || (Memory.peekByte(atcwVar.c + 10) & 32) != 0)) {
                        Context contextC = elementsServices.c();
                        int iPeekInt = Memory.peekInt(atcwVar.aR().c + (true != atdm.a ? 20L : 12L), false);
                        if (iPeekInt == 0) {
                            i = 1;
                        } else if (iPeekInt != 1) {
                            i = iPeekInt != 2 ? 0 : 3;
                        } else {
                            i = 2;
                        }
                        int i6 = (i == 0 ? 1 : i) - 1;
                        if (i6 != 0) {
                            osvVar = i6 != 1 ? new osv(contextC, 45.0f, 90.0f) : new osv(contextC, 0.0f, 45.0f);
                        } else {
                            osvVar = new osv(contextC, 0.0f, 90.0f);
                        }
                        nodeViewInterface2.n().c = osvVar;
                    }
                }
                if ((jG & 32) != 0) {
                    if (atcwVar.u == null && (Memory.peekByte(atcwVar.c + 8) & 16) != 0) {
                        atcwVar.u = new ateu(atcwVar.cp(c != atcy.a ? 28 : 48, atet.a));
                    }
                    int[] iArr = new int[4];
                    DimensionUnitConverter.b(atcwVar.u == null ? ates.a : atcwVar.u, nodeViewInterface2.a(), ((View) nodeViewInterface2).getLayoutDirection(), iArr);
                    nodeViewInterface2.Q(new Rect(iArr[c2], iArr[c], iArr[2], iArr[3]));
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 1) {
            atbf atbfVar = (atbf) metVar;
            int iPeekInt2 = Memory.peekInt(atbfVar.c + 12, false);
            if (iPeekInt2 == 0) {
                i3 = 1;
            } else if (iPeekInt2 == 1) {
                i3 = 2;
            } else if (iPeekInt2 != 2) {
                i3 = 0;
            }
            if (i3 == 0) {
                i3 = 1;
            }
            orq orqVarL2 = elementsServices.l();
            int i7 = i3 - 1;
            if (i7 == 1) {
                nodeViewInterface2.setClickable(true);
                nodeViewInterface2.r(new adee(nodeViewInterface2, atbfVar, orqVarL2, 1));
                return;
            } else {
                if (i7 == 2) {
                    nodeViewInterface2.setLongClickable(true);
                    nodeViewInterface2.r(new adgr(new lez((Object) nodeViewInterface2, (Object) atbfVar, (Object) orqVarL2, 11, (char[]) null), 1));
                    return;
                }
                return;
            }
        }
        atgq atgqVar = (atgq) metVar;
        if ((Memory.peekByte(atgqVar.c + 8) & 2) != 0 && (nodeViewInterface2 instanceof oqu)) {
            oqu oquVar = (oqu) nodeViewInterface2;
            boolean z2 = Memory.peekByte(atgqVar.c + 11) != 0;
            if (oquVar.k != z2) {
                oquVar.k = z2;
                if (z2) {
                    if (oquVar.l == null) {
                        oquVar.l = new nyv();
                    }
                    oquVar.a.w(oquVar.l);
                } else {
                    nyv nyvVar = oquVar.l;
                    if (nyvVar != null) {
                        oquVar.a.Z(nyvVar);
                        oquVar.l = null;
                    }
                }
            }
        }
        if (nodeViewInterface2 instanceof osc) {
            osc oscVar = (osc) nodeViewInterface2;
            boolean z3 = ((Memory.peekByte(atgqVar.c + 8) & 128) == 0 || Memory.peekByte(atgqVar.c + 17) == 0) ? false : true;
            orw orwVar = oscVar.a;
            if (orwVar.q != z3) {
                orwVar.q = z3;
                orwVar.f();
                if (z3 && (text = orwVar.getText()) != null && text.length() > 0) {
                    String string = text.toString();
                    int selectionStart = orwVar.getSelectionStart();
                    int selectionEnd = orwVar.getSelectionEnd();
                    orwVar.f = true;
                    try {
                        orwVar.beginBatchEdit();
                        text.replace(0, text.length(), text);
                        orwVar.g(selectionStart, selectionEnd);
                        orwVar.endBatchEdit();
                        orwVar.f = false;
                        String string2 = text.toString();
                        if (!string.equals(string2)) {
                            orwVar.c(string2);
                        }
                    } catch (Throwable th) {
                        orwVar.f = false;
                        throw th;
                    }
                }
            }
            if ((Memory.peekByte(atgqVar.c + 9) & 16) != 0 && Memory.peekByte(atgqVar.c + 22) != 0) {
                z = true;
            }
            oscVar.a.r = z;
        }
    }
}
