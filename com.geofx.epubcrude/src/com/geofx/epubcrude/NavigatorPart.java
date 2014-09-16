package com.geofx.epubcrude;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.e4.ui.di.Focus;

public class NavigatorPart
{
	@Inject
	public NavigatorPart(Composite parent)
	{
		// assuming that dependency injection works
		// parent will never be null
		System.out.println("Woh! Got a Composite via DI.");

		// does it have a layout manager?
		System.out.println("Layout: " + parent.getLayout().getClass());

	}

	@PostConstruct
	public void postConstruct(Composite parent)
	{
		System.out.println(this.getClass().getSimpleName() + " @PostConstruct method called.");
	}

	@Focus
	public void onFocus()
	{
		System.out.println(this.getClass().getSimpleName() + " @Focus method called");
	}

}