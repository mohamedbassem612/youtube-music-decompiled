package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aezb;
import defpackage.aezc;
import defpackage.aezd;
import defpackage.aezi;
import defpackage.aezn;
import defpackage.aezo;
import defpackage.aezq;
import defpackage.aezy;
import defpackage.dto;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CircularProgressIndicator extends aezb {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        aezd aezdVar = new aezd((aezo) this.a);
        Context context2 = getContext();
        aezo aezoVar = (aezo) this.a;
        aezy aezyVar = new aezy(context2, aezoVar, aezdVar, aezoVar.q == 1 ? new aezn(context2, aezoVar) : new aezi(aezoVar));
        aezyVar.c = dto.b(context2.getResources(), R.drawable.ic_mtrl_arrow_circle, null);
        setIndeterminateDrawable(aezyVar);
        setProgressDrawable(new aezq(getContext(), (aezo) this.a, aezdVar));
        this.g = true;
    }

    @Override // defpackage.aezb
    public final /* synthetic */ aezc a(Context context, AttributeSet attributeSet) {
        return new aezo(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
