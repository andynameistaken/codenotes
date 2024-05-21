## Fonts
There are several default fonts that are available in all browsers. These generic font families include monospace, serif and sans-serif

When one font isn't available, you can tell the browser to "degrade" to another font.

For example, if you wanted an element to use the Helvetica font, but degrade to the sans-serif font when Helvetica isn't available, you will specify it as follows:
```
p {
  font-family: Helvetica, sans-serif;
}
```


CSS has a property called width that controls an element's width. Just like with fonts, we'll use px (pixels) 
to specify the image's width.

For example, if we wanted to create a CSS class called larger-image that gave HTML elements a width of 500 pixels,
 we'd use:
```
<style>
  .larger-image {
    width: 500px;
  }
</style>
```

## Add Borders Around Your Elements
CSS borders have properties like style, color and width.

For example, if we wanted to create a red, 5 pixel border around an HTML element, we could use this class:
```
<style>
  .thin-red-border {
    border-color: red;
    border-width: 5px;
    border-style: solid;
  }
</style>
```

## Basic CSS: Add Rounded Corners with border-radius
Your cat photo currently has sharp corners. 
We can round out those corners with a CSS property called `border-radius`.
In addition to pixels, you can also specify the `border-radius using a percentage.

## Give a Background Color to a div Element
You can set an element's background color with the background-color property.

For example, if you wanted an element's background color to be green, you'd put this within your style element:
```
.green-background {
  background-color: green;
}
```

## Basic CSS: Set the `id` of an Element
In addition to classes, each HTML element can also have an `id` attribute.

There are several benefits to using `id` attributes: You can use an `id` to style a single element and later you'll learn that you can use them to select and modify specific elements with JavaScript.

`id` attributes should be unique. Browsers won't enforce this, but it is a widely agreed upon best practice. So please don't give more than one element the same `id` attribute.

Here's an example of how you give your h2 element the `id` of cat-photo-app:

```
<h2 id="cat-photo-app">
```
One cool thing about id attributes is that, like classes, you can style them using CSS.

However, an id is not reusable and should only be applied to one element. An id also has a higher specificity (importance) than a class so if both are applied to the same element and have conflicting styles, the styles of the id will be applied.

Here's an example of how you can take your element with the id attribute of cat-photo-element and give it the background color of green. In your style element:
```
#cat-photo-element {
  background-color: green;
}
```

## Padding
You may have already noticed this, but all HTML elements are essentially little rectangles.

Three important properties control the space that surrounds each HTML element:
 `padding`, `margin`, and `border`.

* An element's padding controls the amount of space between the element's content and its border.
* An element's margin controls the amount of space between an element's border and 
surrounding elements.
* If you set an element's margin to a negative value, the element will grow larger.
* Sometimes you will want to customize an element so that it has different amounts of padding on each of its sides.
CSS allows you to control the padding of all four individual sides of an element with the 
`padding-top`, `padding-right`, `padding-bottom`, and `padding-left` properties.
* Instead of specifying an element's padding-top, padding-right, padding-bottom, and padding-left 
properties individually, you can specify them all in one line, like this:
`padding: 10px 20px 10px 20px;`

These four values work like a clock: top, right, bottom, left, and will produce the 
exact same result as using the side-specific padding instructions.
## Margin
CSS allows you to control the margin of all four individual sides of an element with the
 `margin-top`, `margin-right`, `margin-bottom`, and `margin-left` properties.
## Attribute selectors
* `[attr=value]`
 This selector matches and styles elements with a specific attribute value. For example, the below code changes the margins of all elements with the attribute type and a corresponding value of radio:

```
[type='radio'] {
  margin: 20px 0px 20px 0px;
}
```
