package com.google.android.libraries.youtube.creation.common.ui.entrypoint;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.aewp;
import defpackage.afnb;
import defpackage.afnq;
import defpackage.afov;
import defpackage.afpe;
import defpackage.afpi;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.ajwo;
import defpackage.aupa;
import defpackage.auph;
import defpackage.tzk;
import defpackage.uik;
import defpackage.uim;
import defpackage.uio;
import defpackage.upk;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class EntryPointView extends uio implements afnb {
    public uik a;
    private Context b;

    @Deprecated
    public EntryPointView(Context context) {
        super(context);
        d();
    }

    private final uik c() {
        d();
        return this.a;
    }

    private final void d() {
        if (this.a == null) {
            uim uimVar = (uim) aguu.as(this, uim.class);
            upk upkVar = new upk(this, 1);
            afpi.c(upkVar);
            try {
                uik uikVarA = uimVar.a();
                this.a = uikVarA;
                if (uikVarA == null) {
                    afpi.b(upkVar);
                }
                this.a.f = this;
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof auph) && !(context instanceof aupa) && !(context instanceof afpe)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (context instanceof afov) {
                    return;
                }
                throw new IllegalStateException("TikTok View " + getClass().toString() + ", cannot be attached to a non-TikTok Fragment");
            } catch (Throwable th) {
                if (this.a == null) {
                    afpi.b(upkVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return uik.class;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (aewp.m(getContext())) {
            Context contextN = aewp.n(this);
            Context context = this.b;
            if (context == null) {
                this.b = contextN;
            } else {
                ahno.P(context == contextN || aewp.o(context), "onAttach called multiple times with different parent Contexts");
            }
        }
        uik uikVarC = c();
        int i = true != uikVarC.e.i() ? 8 : 0;
        uikVarC.d.isPresent();
        uikVarC.a.setVisibility(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    @Override // defpackage.afnb
    public final /* bridge */ /* synthetic */ Object peer() {
        uik uikVar = this.a;
        if (uikVar != null) {
            return uikVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.View
    public final boolean performClick() {
        uik uikVarC = c();
        Optional optional = uikVarC.d;
        optional.isPresent();
        uikVarC.b.a((ajwo) optional.orElse(uikVarC.c));
        return super.performClick();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        EntryPointView entryPointView = c().a;
        ((TextView) entryPointView.findViewById(R.id.entry_point_label_view)).setTextColor(z ? tzk.i(entryPointView.getContext(), R.attr.ytTextPrimary) : tzk.i(entryPointView.getContext(), R.attr.ytTextDisabled));
        ((ImageView) entryPointView.findViewById(R.id.entry_point_icon_view)).setColorFilter(z ? tzk.i(entryPointView.getContext(), R.attr.ytIconActiveOther) : tzk.i(entryPointView.getContext(), R.attr.ytIconDisabled));
    }

    public EntryPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EntryPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EntryPointView(afnq afnqVar) {
        super(afnqVar);
        d();
    }
}
