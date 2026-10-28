package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mfq extends ActionMode.Callback2 {
    private static final agrf a = agrf.h("com/google/android/libraries/elements/contrib/ActionModeCallbackWithBrowserOpen");
    private final TextView b;

    public mfq(TextView textView) {
        this.b = textView;
    }

    private final CharSequence a() {
        TextView textView = this.b;
        CharSequence text = textView.getText();
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        return (selectionStart < 0 || selectionEnd < 0 || selectionStart >= text.length() || selectionEnd > text.length() || selectionStart >= selectionEnd) ? "" : text.subSequence(selectionStart, selectionEnd);
    }

    private final boolean b() {
        Context context = this.b.getContext();
        try {
            context.startActivity(new Intent("android.intent.action.WEB_SEARCH").putExtra("new_search", true).putExtra("query", a().toString()).putExtra("com.android.browser.application_id", context.getPackageName()).addFlags(268435456));
            return true;
        } catch (ActivityNotFoundException e) {
            ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/elements/contrib/ActionModeCallbackWithBrowserOpen", "searchInBrowserForHighlightedQuery", 'c', "ActionModeCallbackWithBrowserOpen.java")).t("No activity found to handle web search");
            return false;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.elements_search_web_action_menu_item_id) {
            return b();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (a().length() != 0) {
            menu.add(0, R.id.elements_search_web_action_menu_item_id, 99, this.b.getContext().getString(R.string.button_web_search));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
