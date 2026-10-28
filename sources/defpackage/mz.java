package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mz extends mb {
    final int c;
    final int d;
    public my e;
    private MenuItem f;

    public mz(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.mb, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        in inVar;
        int headersCount;
        my myVar;
        my myVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                inVar = (in) headerViewListAdapter.getWrappedAdapter();
            } else {
                inVar = (in) adapter;
                headersCount = 0;
            }
            is item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= inVar.getCount()) ? null : inVar.getItem(i);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                iq iqVar = inVar.a;
                if (menuItem != null && (myVar2 = ((na) this.e).b) != null) {
                    ((ij) myVar2).a.a.removeCallbacksAndMessages(iqVar);
                }
                this.f = item;
                if (item != null && (myVar = ((na) this.e).b) != null) {
                    ij ijVar = (ij) myVar;
                    ik ikVar = ijVar.a;
                    Handler handler = ikVar.a;
                    handler.removeCallbacksAndMessages(null);
                    List list = ikVar.b;
                    int size = list.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (iqVar == ((aae) list.get(i2)).c) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        handler.postAtTime(new aew(ijVar, i3 < list.size() ? (aae) list.get(i3) : null, (MenuItem) item, iqVar, 1), iqVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.c) {
                if (!listMenuItemView.isEnabled() || !listMenuItemView.a.hasSubMenu()) {
                    return true;
                }
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                return true;
            }
            if (i == this.d) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (in) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (in) adapter).a.i(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
